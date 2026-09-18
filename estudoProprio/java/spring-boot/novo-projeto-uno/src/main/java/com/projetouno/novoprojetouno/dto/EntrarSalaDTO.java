package com.projetouno.novoprojetouno.dto;

import jakarta.validation.constraints.NotNull;

public record EntrarSalaDTO(
        @NotNull
        Integer codigo
) {
}
