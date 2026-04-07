package com.student.student_management.controller;

import com.student.student_management.entity.Student;
import com.student.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {

        Student s = studentRepository.findById(id).orElseThrow();

        s.setName(student.getName());
        s.setEmail(student.getEmail());
        s.setCourse(student.getCourse());

        return studentRepository.save(s);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
        return "Student deleted";
    }
}
