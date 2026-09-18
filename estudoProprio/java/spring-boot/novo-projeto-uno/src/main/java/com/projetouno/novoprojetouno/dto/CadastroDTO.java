package com.projetouno.novoprojetouno.dto;

import jakarta.validation.constraints.NotEmpty;

public record CadastroDTO(
        @NotEmpty
        String username,
        @NotEmpty
        String senha
) {
}
