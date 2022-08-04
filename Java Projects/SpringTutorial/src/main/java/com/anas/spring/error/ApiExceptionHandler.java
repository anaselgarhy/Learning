package com.anas.spring.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Error> handleApiException(final NotFoundException ex, final WebRequest request) {
       return new ResponseEntity<>(new Error(ex.getMessage(), request.getDescription(false)), ex.getStatus());
    }
}
