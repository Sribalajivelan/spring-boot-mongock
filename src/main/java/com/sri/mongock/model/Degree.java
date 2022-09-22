package com.sri.mongock.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@Document(indexName = "spring_boot_degree")
public class Degree {

    @Id
    private String id;

    @NotEmpty(message="Name must not be empty")
    private String name;
}
