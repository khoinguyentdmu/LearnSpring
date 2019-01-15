package com.example.di_java_configuration.repository;

import com.example.di_java_configuration.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
