package com.projetouno.novoprojetouno.dto;

import jakarta.validation.constraints.NotEmpty;

public record LoginDTO(
        @NotEmpty
        String username,
        @NotEmpty
        String senha
) {
}
