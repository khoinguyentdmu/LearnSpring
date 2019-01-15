package com.example.di_annotation_usingXML;

import com.example.di_annotation_usingXML.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext11.xml");
        StudentService service = (StudentService) context.getBean("studentService");

        System.out.println(service.findAll().toString());
    }
}