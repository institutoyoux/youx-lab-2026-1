package com.cursospring.libaryapi.exceptions;

public class RegistroDuplicadoException extends RuntimeException{
    public RegistroDuplicadoException(String mensagem) {
        super(mensagem);
    }
}
