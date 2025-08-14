package com.kapil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringBootFeaturesSampleMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootFeaturesSampleMain.class, args);
    }
}
