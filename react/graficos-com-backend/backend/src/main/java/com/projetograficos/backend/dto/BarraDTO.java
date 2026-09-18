package com.projetograficos.backend.dto;

import java.time.LocalDate;

public record BarraDTO(
        LocalDate data,
        Double ganhos,
        Double perdas
) {
}
