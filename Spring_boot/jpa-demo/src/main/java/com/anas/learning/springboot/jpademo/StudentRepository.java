package com.anas.learning.springboot.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/9/22
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
