package com.example.library;

import com.example.library.Business.core.utilities.exceptions.BusinessException;
import com.example.library.Business.core.utilities.exceptions.ProblemDetails;
import com.example.library.Business.core.utilities.exceptions.ValidationProblemDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessExceptions (BusinessException businessException){
        ProblemDetails problemDetails = new ProblemDetails();
        problemDetails.setMessage(businessException.getMessage());
        return problemDetails;
    }
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ProblemDetails handleValidationExceptions (MethodArgumentNotValidException methodArgumentNotValidException){
        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
        validationProblemDetails.setMessage("Doğrulama hatası tespit edildi!");
        validationProblemDetails.setErrors(new HashMap<String, String>());

        for (FieldError fieldError : methodArgumentNotValidException.getBindingResult().getFieldErrors()) {
            validationProblemDetails.getErrors().put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return validationProblemDetails;
    }
}
