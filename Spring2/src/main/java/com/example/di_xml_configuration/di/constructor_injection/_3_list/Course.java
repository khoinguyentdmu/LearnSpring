package com.example.di_xml_configuration.di.constructor_injection._3_list;

import java.util.List;

public class Course {
    private Integer id;
    private String name;
    private List<Student> students;

    public Course(Integer id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
