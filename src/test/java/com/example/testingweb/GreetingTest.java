package com.example.testingweb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingTest {

    @Autowired
    private GreetingService greetingService;

   /* @Test
    public void greetingServiceTest(){
        assertThat(greetingService.greet()).isEqualTo("Finaliza el curso DevOps Foundation v3 - Joseph López");
    }

    @Test
    public void greetingServiceValidation(){
        assertThat(greetingService.greet()).isNotNull();
        assertThat(greetingService.greet()).isNotEmpty();
        assertThat(greetingService.greet()).isNotBlank();
    }*/
}
