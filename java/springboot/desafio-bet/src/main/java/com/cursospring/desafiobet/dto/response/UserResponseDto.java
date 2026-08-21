package com.cursospring.desafiobet.dto.response;

import java.time.LocalDate;

public record UserResponseDto(
        Long id,
        String email,
        LocalDate dataNascimento,
        Double balance,
        Boolean blocked
) {
}
