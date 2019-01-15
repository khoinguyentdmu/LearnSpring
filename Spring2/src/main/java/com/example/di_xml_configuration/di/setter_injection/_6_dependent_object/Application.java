package com.example.di_xml_configuration.di.setter_injection._6_dependent_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
