package com.example.di_xml_configuration.sample2.repository;

import com.example.di_xml_configuration.sample2.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
