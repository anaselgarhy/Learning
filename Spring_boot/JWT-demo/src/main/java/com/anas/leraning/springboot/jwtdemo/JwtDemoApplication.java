package com.anas.leraning.springboot.jwtdemo;

import com.anas.leraning.springboot.jwtdemo.domain.AppUser;
import com.anas.leraning.springboot.jwtdemo.domain.Role;
import com.anas.leraning.springboot.jwtdemo.domain.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JwtDemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(JwtDemoApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(final UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new AppUser(null, "Anas Elgarhy", "anas", "1234", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Ahmed Elgarhy", "ahmed", "1234", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Mohamed Elgarhy", "mohamed", "1234", new ArrayList<>()));
            userService.saveUser(new AppUser(null, "Ali Elgarhy", "ali", "1234", new ArrayList<>()));

            userService.addRoleToUser("anas", "ROLE_USER");
            userService.addRoleToUser("anas", "ROLE_MANAGER");
            userService.addRoleToUser("anas", "ROLE_ADMIN");
            userService.addRoleToUser("anas", "ROLE_SUPER_ADMIN");

            userService.addRoleToUser("ahmed", "ROLE_USER");
            userService.addRoleToUser("ahmed", "ROLE_MANAGER");
            userService.addRoleToUser("ahmed", "ROLE_ADMIN");

            userService.addRoleToUser("mohamed", "ROLE_USER");
            userService.addRoleToUser("mohamed", "ROLE_MANAGER");

            userService.addRoleToUser("ali", "ROLE_USER");
        };
    }
}
