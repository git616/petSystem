package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.pet")
public class GitTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class,args);
    }
}
