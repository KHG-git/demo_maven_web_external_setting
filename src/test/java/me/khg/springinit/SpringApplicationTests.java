package me.khg.springinit;



import com.example.demo_maven_web.DemoMavenWebApplication;
import com.example.demo_maven_web.SampleRunner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@ExtendWith(SampleRunner.class)
@SpringBootTest(classes = DemoMavenWebApplication.class)
public class SpringApplicationTests {

    @Autowired
    Environment environment;

    @Test
    public void contextLoads() {
        assertThat(environment.getProperty("khg.name"))
                .isEqualTo("whiteship");
    }

}
