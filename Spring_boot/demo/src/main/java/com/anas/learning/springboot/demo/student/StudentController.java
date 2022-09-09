package com.anas.learning.springboot.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @date: 9/8/22
 */
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> students() {
        return studentService.students();
    }

    @PostMapping
    public Student registerNewStudent(@RequestBody final Student student) {
        return studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "delete/{studentId}")
    public void deleteStudent(@PathVariable("studentId") final Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping(path = "update/{studentId}")
    public Student updateStudent(
            @PathVariable("studentId") final Long id,
            @RequestParam(required = false) final String newName,
            @RequestParam(required = false) final String newEmail
    ) {
        return studentService.updateStudent(id, newName, newEmail);
    }
}
