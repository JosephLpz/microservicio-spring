package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    final String CONST = "Finaliza el curso DevOps Foundation v3 - Joseph López";
    public String greet() {
        return CONST;
    }
}
