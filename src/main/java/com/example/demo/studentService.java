package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class studentService {


    private final studentRepository studentRepo;

    @Autowired
    public studentService(studentRepository p_studentRepo){
        this.studentRepo = p_studentRepo;
    }

    public void registerStudent(student Entity){
        studentRepo.save(Entity);
    }

}
