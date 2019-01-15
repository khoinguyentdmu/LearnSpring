package com.example.di_xml_configuration.sample2.service;

import com.example.di_xml_configuration.sample2.model.Student;
import com.example.di_xml_configuration.sample2.repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepo;

    public StudentRepository getStudentRepo() {
        return studentRepo;
    }

    public void setStudentRepo(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> findAll() {
        return this.studentRepo.findAll();
    }
}
