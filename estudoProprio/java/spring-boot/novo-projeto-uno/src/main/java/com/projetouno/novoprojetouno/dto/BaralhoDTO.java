package com.projetouno.novoprojetouno.dto;

import com.projetouno.novoprojetouno.models.Carta;

import java.util.List;

public record BaralhoDTO(
        List<Carta> cartas
) {
}
