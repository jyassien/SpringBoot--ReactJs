package com.fullStack.springReact.service;

import java.util.List;

import com.fullStack.springReact.model.Student;

public interface StudentService {
    public Student saveStudent(Student student );
    public List<Student> getAllStudents();
}