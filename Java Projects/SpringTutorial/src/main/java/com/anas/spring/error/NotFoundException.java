package com.anas.spring.error;

import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException {
    public NotFoundException(final String message) {
        super(message);
    }

    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
