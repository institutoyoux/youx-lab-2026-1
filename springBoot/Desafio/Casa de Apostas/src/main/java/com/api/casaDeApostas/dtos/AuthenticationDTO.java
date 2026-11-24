package com.api.casaDeApostas.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record AuthenticationDTO(
        @Email @NotBlank
        String email,

        @NotBlank
        String password,

        BigDecimal balance
) {
}
