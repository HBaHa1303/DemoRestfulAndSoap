package com.example.projectdemorestfulandsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjectDemoRestfulAndSoapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectDemoRestfulAndSoapApplication.class, args);
    }

}
