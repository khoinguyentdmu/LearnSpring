package com.example.di_xml_configuration.di.constructor_injection._2_dependent_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Student obj = (Student) context.getBean("student");
        System.out.println(obj.toString());
    }
}
