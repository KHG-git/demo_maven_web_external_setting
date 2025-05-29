package com.example.demo_maven_web;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.ApplicationRunner;

@Component
public class SampleRunner implements ApplicationRunner {


    //@Value("${khg.name}")
//    @Value("${khg.name}")
//    private String name;
//
//    @Value("${khg.age}")
//    private int age;


    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);



    @Autowired
    private String hello;


    @Autowired
    KangProperties kangProperties;


    @Override
    public void run(ApplicationArguments args) throws Exception {



        logger.info("===========================");
        logger.info("logger[info] name : " + kangProperties.getName());
        logger.info("logger[info] age : " + kangProperties.getAge());
        logger.info("logger[info] fullName : " + kangProperties.getFullName());
        logger.info("logger[info] seestionTimeout : " + kangProperties.getSeesionTimeout());
        logger.info("logger[info] hello : "+ hello);
        logger.info("===========================");

        logger.debug("===========================");
        logger.debug("logger[debug] name : " + kangProperties.getName());
        logger.debug("logger[debug] age : " + kangProperties.getAge());
        logger.debug("logger[debug] fullName : " + kangProperties.getFullName());
        logger.debug("logger[debug] seestionTimeout : " + kangProperties.getSeesionTimeout());
        logger.debug("logger[debug] hello : "+ hello);
        logger.debug("===========================");

        System.out.println("===========================");
        System.out.println("name : " + kangProperties.getName());
        System.out.println("age : " + kangProperties.getAge());
        System.out.println("fullName : " + kangProperties.getFullName());
        System.out.println("seestionTimeout : " + kangProperties.getSeesionTimeout());
        System.out.println("hello : "+ hello);
        System.out.println("===========================");
    }
}
