package com.anas.leraning.springboot.jwtdemo.domain.repo;

import com.anas.leraning.springboot.jwtdemo.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 13/09/2022
 */
public interface UserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(final String username);

    void deleteByUsername(final String username);
}
