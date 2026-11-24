package com.api.casaDeApostas.dtos;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record CriarJogoResponseDTO(
        UUID id,
        List<Integer> posicoes,
        BigDecimal valorAposta
) {
}