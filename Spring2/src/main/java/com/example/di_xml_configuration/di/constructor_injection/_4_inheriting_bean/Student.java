package com.example.di_xml_configuration.di.constructor_injection._4_inheriting_bean;

public class Student {
    private Integer id;
    private String name;
    private Address address;

    public Student(Integer id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
