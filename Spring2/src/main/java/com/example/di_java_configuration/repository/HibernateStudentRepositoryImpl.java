package com.example.di_java_configuration.repository;

import com.example.di_java_configuration.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HibernateStudentRepositoryImpl implements StudentRepository {

    public List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();

        Student student = new Student(1, "name1", "address1");
        students.add(student);

        return students;
    }
}
