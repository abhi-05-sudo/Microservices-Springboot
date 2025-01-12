package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String ResourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with %s : '%s'", ResourceName, fieldName, fieldValue));
    }
}