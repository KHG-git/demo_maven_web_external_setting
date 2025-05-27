/*
프로퍼티 우선 순위
유저 홈 디렉토리에 있는 spring-boot-dev-tools.properties
테스트에 있는 @TestPropertySource
@SpringBootTest 애노테이션의 properties 애트리뷰트
커맨드 라인 아규먼트
SPRING_APPLICATION_JSON (환경 변수 또는 시스템 프로티) 에 들어있는 프로퍼티
ServletConfig 파라미터
ServletContext 파라미터
java:comp/env JNDI 애트리뷰트
System.getProperties() 자바 시스템 프로퍼티
OS 환경 변수
RandomValuePropertySource
JAR 밖에 있는 특정 프로파일용 application properties
JAR 안에 있는 특정 프로파일용 application properties
JAR 밖에 있는 application properties
JAR 안에 있는 application properties
@PropertySource
기본 프로퍼티 (SpringApplication.setDefaultProperties)

 */

package com.example.demo_maven_web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootApplication
public class DemoMavenWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoMavenWebApplication.class, args);
	}
}
