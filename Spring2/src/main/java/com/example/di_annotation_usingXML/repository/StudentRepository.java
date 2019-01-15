package com.example.di_annotation_usingXML.repository;

import com.example.di_annotation_usingXML.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
