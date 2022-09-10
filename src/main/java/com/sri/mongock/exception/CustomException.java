package com.sri.mongock.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomException extends RuntimeException {

    private String message;

    private HttpStatus status;
}
