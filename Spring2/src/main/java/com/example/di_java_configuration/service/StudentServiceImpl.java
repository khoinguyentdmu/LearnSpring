package com.example.di_java_configuration.service;

import com.example.di_java_configuration.model.Student;
import com.example.di_java_configuration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public StudentServiceImpl(StudentRepository studentRepo) {
        System.out.println("We are using constructor injection");
        this.studentRepo = studentRepo;
    }

    public StudentServiceImpl(){}

    public void setStudentRepo(StudentRepository studentRepo) {
        System.out.println("We are using setter injection");
        this.studentRepo = studentRepo;
    }

    public List<Student> findAll() {
        return this.studentRepo.findAll();
    }
}
