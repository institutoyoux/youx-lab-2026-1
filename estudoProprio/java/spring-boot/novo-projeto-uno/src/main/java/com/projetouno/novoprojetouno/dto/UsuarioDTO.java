package com.projetouno.novoprojetouno.dto;

import com.projetouno.novoprojetouno.models.Carta;

import java.util.List;

public record UsuarioDTO(
        String username,
        List<Carta> cartas
) {
}
