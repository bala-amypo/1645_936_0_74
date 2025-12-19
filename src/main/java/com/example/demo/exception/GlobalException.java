package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ValidationException;
import org.springframework.web.bind.annotation.ValidationException;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(){
        return "";
    }
}