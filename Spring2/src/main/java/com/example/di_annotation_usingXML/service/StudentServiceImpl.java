package com.example.di_annotation_usingXML.service;

import com.example.di_annotation_usingXML.model.Student;
import com.example.di_annotation_usingXML.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    //@Autowired
    private StudentRepository studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepo) {
        System.out.println("We are using constructor injection");
        this.studentRepo = studentRepo;
    }

    /*@Autowired
    public void setStudentRepo(StudentRepository studentRepo) {
        System.out.println("We are using setter injection");
        this.studentRepo = studentRepo;
    }*/

    public List<Student> findAll() {
        return this.studentRepo.findAll();
    }
}
