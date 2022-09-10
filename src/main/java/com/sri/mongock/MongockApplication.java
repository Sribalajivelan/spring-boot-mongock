package com.sri.mongock;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.sri.mongock.repository"})
@EnableMongock
public class MongockApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongockApplication.class, args);
    }
}
