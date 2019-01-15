package com.example.di_xml_configuration.di.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext9.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
