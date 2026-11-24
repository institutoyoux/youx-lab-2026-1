package com.api.casaDeApostas.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record ConfigurarJogoDTO(

        @NotNull(message = "A quantidade de bombas é obrigatória.")
        @Min(value = 1, message = "Deve existir pelo menos uma bomba.")
        @Max(value = 24, message = "A quantidade máxima de bombas é 24.")
        Integer quantidadeDeBombas

) {
}