package com.example.di_xml_configuration.di.constructor_injection._4_inheriting_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2.toString());
    }
}
