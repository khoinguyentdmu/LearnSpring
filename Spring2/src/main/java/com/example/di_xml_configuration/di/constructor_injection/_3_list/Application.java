package com.example.di_xml_configuration.di.constructor_injection._3_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Course course = (Course) context.getBean("course");
        System.out.println(course);
    }
}
