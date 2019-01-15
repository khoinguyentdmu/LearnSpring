package com.example.di_xml_configuration.di.constructor_injection._3_list;

public class Student {
    private Integer id;
    private String name;
    private String address;

    public Student(Integer id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
