package com.anas.learning.springboot.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/8/22
 */
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
            var anas = new Student(
                            "Anas Elgarhy",
                            "anas@email.com",
                            LocalDate.of(2003, Month.MARCH, 26));
            var maram = new Student(
                            "Maram Mohamed",
                            "mmhomed@gmail.com",
                            LocalDate.of(2001, Month.APRIL, 3));

            studentRepository.saveAll(List.of(anas, maram));
        };
    }
}
