package com.cursospring.desafiobet.exceptions;

import com.cursospring.desafiobet.dto.response.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class GlobalExceptionHandler {
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<ErrorResponseDto> handleBadCredentials(BadCredentialsException e) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new ErrorResponseDto(e.getMessage()));
    }

    @ExceptionHandler(InvalidBodyRequestException.class)
    public ResponseEntity<ErrorResponseDto> handleInvalidBodyRequest(InvalidBodyRequestException e) {
        return ResponseEntity.badRequest().body(new ErrorResponseDto(e.getMessage()));
    }
    @ExceptionHandler(ErroGenericException.class)
    public ResponseEntity<ErrorResponseDto> handleErroGeneric(ErroGenericException e) {
        return ResponseEntity.badRequest().body(new ErrorResponseDto(e.getMessage()));
    }
    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleUserAlreadyExists(UserAlreadyExistsException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponseDto(e.getMessage()));
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleAll(Exception e) {
        System.out.println(e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorResponseDto("Erro interno no servidor"));
    }
}
