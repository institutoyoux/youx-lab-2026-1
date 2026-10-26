package com.youX.libraryapi.controller.dto;

import org.springframework.http.HttpStatus;

import java.util.List;

public record ErroResposta(int status, String menssagem, List<ErroCampo> erros) {

    public static ErroResposta respostaPadrao(String mensagem){
        return new ErroResposta(HttpStatus.BAD_REQUEST.value(), mensagem, List.of());
    }

    public static ErroResposta conflito(String menssagem){
        return  new ErroResposta(HttpStatus.CONFLICT.value(), menssagem, List.of() );
    }
}
