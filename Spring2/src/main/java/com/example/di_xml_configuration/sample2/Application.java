package com.example.di_xml_configuration.sample2;

import com.example.di_xml_configuration.sample2.service.StudentService;
import com.example.di_xml_configuration.sample2.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext10.xml");
        StudentService service = (StudentService) context.getBean("studentService");

        System.out.println(service.findAll().toString());
    }
}