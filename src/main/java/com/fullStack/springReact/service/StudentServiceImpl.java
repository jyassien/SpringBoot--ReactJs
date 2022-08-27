package com.fullStack.springReact.service;

import com.fullStack.springReact.model.Student;
import com.fullStack.springReact.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

//    @Autowired
    private final StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

   @Override
    public Student saveStudent(Student student ){
       return studentRepository.save(student );
   }
}