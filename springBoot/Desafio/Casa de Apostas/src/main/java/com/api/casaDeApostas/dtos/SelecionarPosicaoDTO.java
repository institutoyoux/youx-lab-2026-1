package com.api.casaDeApostas.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record SelecionarPosicaoDTO(

        @NotNull(message = "Informe uma posição.")
        @Min(value = 1, message = "A posição mínima é 1.")
        @Max(value = 25, message = "A posição máxima é 25.")
        Integer numeroPosicao

) {
}