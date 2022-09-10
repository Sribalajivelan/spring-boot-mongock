package com.sri.mongock.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ErrorModel {

    private HttpStatus httpStatus;

    private LocalDateTime timestamp;

    private String message;

    private String details;

    public ErrorModel(HttpStatus httpStatus, String details) {
        this.httpStatus = httpStatus;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public ErrorModel(HttpStatus httpStatus, String message, String details) {
        this.httpStatus = httpStatus;
        this.timestamp = LocalDateTime.now();
        this.message = message;
        this.details = details;
    }

}
