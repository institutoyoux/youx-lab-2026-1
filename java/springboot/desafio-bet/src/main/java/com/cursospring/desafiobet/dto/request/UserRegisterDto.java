package com.cursospring.desafiobet.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

public record UserRegisterDto(
        String nome,
        @Email
        String email,
        @Past
        LocalDate data_nascimento,
        String password,
        String confirmPass
) {
}
