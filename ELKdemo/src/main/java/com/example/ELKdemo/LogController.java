package com.example.ELKdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/test-log")
    public String testLog() {
        logger.info("Test log entry from Spring Boot app with JSON format");
        return "Logged!";
    }
}
