package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.config.JpaConfig;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[]{Application.class, JpaConfig.class}, args);
    }
}
