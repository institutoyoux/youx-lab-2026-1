package com.cursospring.desafiobet.dto.response;

import com.cursospring.desafiobet.model.enums.GameStatus;

import java.util.List;

public record GameDtoResponse(
        GameStatus status,
        List<Integer> openCells,
        Double value
) {
}
