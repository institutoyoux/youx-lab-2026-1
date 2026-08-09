package com.cursospring.minitwitter.exceptions;

public class CampoAlreadyExistsException extends RuntimeException {
    public CampoAlreadyExistsException(String message) {
        super(message);
    }
}
