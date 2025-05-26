package com.example.demo_maven_web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;


import org.springframework.boot.ApplicationRunner;

@Component
public class SampleRunner implements ApplicationRunner {

    //@Value("${khg.name}")
    @Value("${khg.name}")
    private String name;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===========================");
        System.out.println("name : " + name);
        System.out.println("===========================");
    }
}
