package com.cursospring.desafiobet.exceptions;

public class InvalidBodyRequestException extends RuntimeException {
    public InvalidBodyRequestException(String message) {
        super(message);
    }
}
