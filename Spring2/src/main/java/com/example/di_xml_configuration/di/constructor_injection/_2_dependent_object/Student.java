package com.example.di_xml_configuration.di.constructor_injection._2_dependent_object;

public class Student {
    private Integer id;
    private String name;
    private Address address;

    public Student(Integer id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
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
