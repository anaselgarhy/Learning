package com.anas.learning.springboot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/8/22
 */
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> students() {
        return studentRepository.findAll();
    }

    public Student addNewStudent(final Student student) {
        if (studentRepository.findByEmail(student.getEmail()).isPresent()) {
            throw new IllegalStateException("Email already taken");
        }
        System.out.println("student = " + student);
        return studentRepository.save(student);
    }

    public void deleteStudent(final Long id) {
        if (!studentRepository.existsById(id)) {
            throw new IllegalStateException("Student with id " + id + " does not exist");
        }
        studentRepository.deleteById(id);
    }

    @Transactional
    public Student updateStudent(final Long id, final String newName, final String newEmail) {
        final var student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Student with id " + id + " does not exist"));

        if (newName != null && newName.length() > 0 && !newName.equals(student.getName())) {
            student.setName(newName);
        } else {
            throw new IllegalStateException("Name is not valid");
        }
        if (newEmail != null && newEmail.length() > 0 && !newEmail.equals(student.getEmail())) {
            if (studentRepository.findByEmail(newEmail).isPresent()) {
                throw new IllegalStateException("Email already taken");
            }
            student.setEmail(newEmail);
        } else {
            throw new IllegalStateException("Email is not valid");
        }
        return student;
    }
}
