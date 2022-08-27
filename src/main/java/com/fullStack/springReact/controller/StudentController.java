package com.fullStack.springReact.controller;

import com.fullStack.springReact.model.Student;
import com.fullStack.springReact.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
//    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student)
    {
        studentService.saveStudent(student);
        return "New Student is added";
    }

}