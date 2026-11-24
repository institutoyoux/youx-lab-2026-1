package com.api.casaDeApostas.dtos;

import com.api.casaDeApostas.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record RegisterDTO(

        @NotBlank
        String name,

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "Formato de e-mail inválido")
        @NotBlank
        String email,

        @NotNull(message = "A data de nascimento é obrigatória")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        LocalDate nascDate,

        @NotBlank
        String password,

        @NotBlank
        String passwordConfirm,

        @NotNull(message = "O perfil é obrigatório")
        @Enumerated(EnumType.STRING)
        UserRole role
) {


}
