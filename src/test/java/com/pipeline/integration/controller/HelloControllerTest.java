package com.pipeline.integration.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void testHello() {
        // Test logic for hello() method
        String expected = "Hello, World";
        String actual = helloController.hello();
        assertEquals(expected, actual);
    }
}
