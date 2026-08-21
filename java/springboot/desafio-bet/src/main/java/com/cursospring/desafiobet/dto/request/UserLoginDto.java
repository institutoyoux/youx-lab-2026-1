package com.cursospring.desafiobet.dto.request;

import jakarta.validation.constraints.Email;

public record UserLoginDto(
        @Email
        String email,
        String password
) {
}
