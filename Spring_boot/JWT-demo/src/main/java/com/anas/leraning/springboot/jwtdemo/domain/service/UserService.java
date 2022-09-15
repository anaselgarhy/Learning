package com.anas.leraning.springboot.jwtdemo.domain.service;

import com.anas.leraning.springboot.jwtdemo.domain.Role;
import com.anas.leraning.springboot.jwtdemo.domain.AppUser;
import org.springframework.data.domain.Page;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 13/09/2022
 */
public interface UserService {
    AppUser saveUser(AppUser appUser);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    Iterable<AppUser> getUsers();
    Page<AppUser> getUsers(int page, int size);

    Iterable<Role> getRoles();

    void deleteUser(String username);

    void deleteRole(String roleName);
}
