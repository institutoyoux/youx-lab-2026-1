package com.projetos.backend.dto;

public record UsuarioDTO(
        String username,
        String nome,
        String fotoUrl,
        String docUrl
) {
}
