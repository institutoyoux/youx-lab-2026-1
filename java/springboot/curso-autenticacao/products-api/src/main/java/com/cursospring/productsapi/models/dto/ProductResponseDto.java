package com.cursospring.productsapi.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductResponseDto(
        @NotBlank
        String name,
        @NotNull
        Double price
) {
}
