package com.anas.learning.springboot.jpademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/9/22
 */
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(final StudentRepository studentRepository) {
        return args -> {
            studentRepository.save(
                    new Student("Anas", "Elgarhy", "a@mail.com", 22)
            );
        };
    }
}
