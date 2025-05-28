package com.example.demo_maven_web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;


import org.springframework.boot.ApplicationRunner;

@Component
public class SampleRunner implements ApplicationRunner {


    //@Value("${khg.name}")
//    @Value("${khg.name}")
//    private String name;
//
//    @Value("${khg.age}")
//    private int age;

    @Autowired
    private String hello;


    @Autowired
    KangProperties kangProperties;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===========================");
        System.out.println("name : " + kangProperties.getName());
        System.out.println("age : " + kangProperties.getAge());
        System.out.println("fullName : " + kangProperties.getFullName());
        System.out.println("seestionTimeout : " + kangProperties.getSeesionTimeout());
        System.out.println("hello : "+ hello);
        System.out.println("===========================");
    }
}
