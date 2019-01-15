package com.example.di_java_configuration;

import com.example.di_java_configuration.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = (StudentService) context.getBean("studentService");

        System.out.println(service.findAll().toString());
    }
}