package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    
    @Autowired
    private  StudentRepository studentRepository;
    
    @GetMapping
    public List<Student> getAllusers() {
        return studentRepository.findAll();
    }
    
    @PostMapping
    public Student createUser(@RequestBody Student user) {
        return studentRepository.save(user);
    }
}
