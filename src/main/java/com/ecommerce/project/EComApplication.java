package com.ecommerce.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "com.ecommerce.project")
public class EComApplication {

    public static void main(String[] args) {
        SpringApplication.run(EComApplication.class, args);
    }

}