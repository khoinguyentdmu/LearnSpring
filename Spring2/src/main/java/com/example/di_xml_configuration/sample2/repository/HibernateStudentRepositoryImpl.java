package com.example.di_xml_configuration.sample2.repository;

import com.example.di_xml_configuration.sample2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class HibernateStudentRepositoryImpl implements StudentRepository {

    public List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();

        Student student = new Student(1, "name1", "address1");
        students.add(student);

        return students;
    }
}
