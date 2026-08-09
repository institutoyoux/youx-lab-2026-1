package com.cursospring.minitwitter.models.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRegisterDto(
        @NotBlank(message = "O username não pode estar vazio")
        String username,
        @NotBlank(message = "O email não pode estar vazio")
        @Email(message = "o campo email é invalido")
        String email,
        @NotBlank(message = "A senha não pode estar vazia")
        @Size(min = 8, message = "A senha deve ter pelo menos 8 caracteres")
        String password
) {
}
