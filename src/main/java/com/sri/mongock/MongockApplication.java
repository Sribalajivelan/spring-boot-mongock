package com.sri.mongock;

import io.mongock.runner.springboot.EnableMongock;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.sri.mongock.repository"})
@EnableMongock
@OpenAPIDefinition(info = @Info(title = "MongoCK Sample API ", version = "2.0", description = "MongoCK Sample Information"))
public class MongockApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongockApplication.class, args);
    }
}
