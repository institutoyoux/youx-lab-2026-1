package com.projetograficos.backend.dto;

import java.time.LocalDate;

public record RadarDTO(
        LocalDate data,
        Double lucro
) {
}
