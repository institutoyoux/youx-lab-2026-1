package com.cursospring.productsapi.models.dto;

public record AuthenticationDto(
        String login,
        String password
) {
}
