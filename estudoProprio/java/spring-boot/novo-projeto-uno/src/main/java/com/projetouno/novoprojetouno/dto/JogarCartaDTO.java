package com.projetouno.novoprojetouno.dto;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record JogarCartaDTO(
        @NotNull
        List<Integer> cartas
) {
}
