package me.khg.springinit;



import com.example.demo_maven_web.DemoMavenWebApplication;
import com.example.demo_maven_web.SampleRunner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@ExtendWith(SampleRunner.class)
//아래처럼 써도 됨 일단 주석
//@SpringBootTest(classes = DemoMavenWebApplication.class, properties="khg.name=kang22222333444" )
@TestPropertySource(locations="classpath:/test.properties")
//@TestPropertySource(properties="khg.name=kang22222333444")
@SpringBootTest(classes = DemoMavenWebApplication.class)
public class SpringApplicationTests {

    @Autowired
    Environment environment;

    @Test
    public void contextLoads() {
        assertThat(environment.getProperty("khg.name"))
                .isEqualTo("kang33");
    }

}
