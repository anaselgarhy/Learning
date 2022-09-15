package com.anas.leraning.springboot.jwtdemo.domain.repo;

import com.anas.leraning.springboot.jwtdemo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 13/09/2022
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(final String name);

    void deleteByName(final String name);
}
