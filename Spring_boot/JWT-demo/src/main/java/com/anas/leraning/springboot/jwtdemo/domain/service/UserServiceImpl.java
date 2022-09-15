package com.anas.leraning.springboot.jwtdemo.domain.service;

import com.anas.leraning.springboot.jwtdemo.domain.AppUser;
import com.anas.leraning.springboot.jwtdemo.domain.Role;
import com.anas.leraning.springboot.jwtdemo.domain.repo.RoleRepository;
import com.anas.leraning.springboot.jwtdemo.domain.repo.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 13/09/2022
 */
@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        final var rowUser = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        final var authorities = rowUser.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toCollection(ArrayList::new)); // or toList()
        return new User(rowUser.getUsername(), rowUser.getPassword(), authorities);
    }

    @Override
    public AppUser saveUser(final AppUser appUser) {
        log.info("Saving new appUser {} to the database", appUser.getName());
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword())); // encode password  before saving
        return userRepository.save(appUser);
    }

    @Override
    public Role saveRole(final Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(final String username, final String roleName) {
        final var user = userRepository.findByUsername(username).orElseThrow();
        final var role = roleRepository.findByName(roleName).orElseThrow();
        log.info("Adding role {} to user {}", role.getName(), user.getName());
        user.getRoles().add(role);
    }

    @Override
    public AppUser getUser(final String username) {
        log.info("Fetching user {}", username);
        return userRepository.findByUsername(username).orElseThrow();
    }

    @Override
    public Iterable<AppUser> getUsers() {
        log.info("Getting all users from the database");
        return userRepository.findAll();
    }

    @Override
    public Page<AppUser> getUsers(final int page, final int size) {
        log.info("Getting {} users from page {}", size, page);
        return userRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public Iterable<Role> getRoles() {
        log.info("Getting all roles from the database");
        return roleRepository.findAll();
    }

    @Override
    public void deleteUser(final String username) {
        log.info("Deleting user {}", username);
        userRepository.deleteByUsername(username);
    }

    @Override
    public void deleteRole(final String roleName) {
        log.info("Deleting role {}", roleName);
        roleRepository.deleteByName(roleName);
    }


}
