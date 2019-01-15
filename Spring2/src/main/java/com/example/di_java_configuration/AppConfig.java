package com.example.di_java_configuration;

import com.example.di_java_configuration.repository.HibernateStudentRepositoryImpl;
import com.example.di_java_configuration.repository.StudentRepository;
import com.example.di_java_configuration.service.StudentService;
import com.example.di_java_configuration.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.di_java_configuration"})
public class AppConfig {

    @Bean(name = "studentService")
    public StudentService getStudentService(){
        StudentServiceImpl service = new StudentServiceImpl();
        //service.setStudentRepo(getStudentRepository());
        return service;
    }

    @Bean(name = "studentRepository")
    public StudentRepository getStudentRepository(){
        return new HibernateStudentRepositoryImpl();
    }
}
