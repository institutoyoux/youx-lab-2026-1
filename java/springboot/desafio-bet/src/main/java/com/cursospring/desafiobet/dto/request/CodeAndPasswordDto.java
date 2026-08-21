package com.cursospring.desafiobet.dto.request;

import jakarta.validation.constraints.NotBlank;

public record CodeAndPasswordDto(
        Integer code,
        @NotBlank
        String email,
        @NotBlank
        String password
) {
}
