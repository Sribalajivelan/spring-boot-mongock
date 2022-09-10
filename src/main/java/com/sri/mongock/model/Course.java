package com.sri.mongock.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Document
@Data
public class Course {

    @Id
    private String id;

    @NotEmpty(message = "Name is required")
    private String name;
}
