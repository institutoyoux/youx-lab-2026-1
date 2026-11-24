package com.api.casaDeApostas.dtos;

import com.api.casaDeApostas.enums.StatusJogo;
import com.api.casaDeApostas.enums.TipoPosicao;

import java.math.BigDecimal;
import java.util.UUID;

public record SelecionarPosicaoResponseDTO(
        UUID jogoId,
        Integer numeroPosicao,
        TipoPosicao resultado,
        StatusJogo status,
        BigDecimal valorAposta
) {
}