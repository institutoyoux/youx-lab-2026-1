package com.api.casaDeApostas.dtos;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ApostaDTO(

        @NotBlank
        BigDecimal valorAposta
) {
}
