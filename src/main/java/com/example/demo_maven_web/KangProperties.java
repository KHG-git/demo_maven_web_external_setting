package com.example.demo_maven_web;


import jakarta.validation.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;

@Component
@ConfigurationProperties("khg")
@Validated
public class KangProperties {

    @NotEmpty
    private String name;
    private int age;
    private String fullName;

    public Duration getSeesionTimeout() {
        return seesionTimeout;
    }

    public void setSeesionTimeout(Duration seesionTimeout) {
        this.seesionTimeout = seesionTimeout;
    }

    //@DurationUnit(ChronoUnit.SECONDS)
    private Duration seesionTimeout = Duration.ofSeconds(30);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
