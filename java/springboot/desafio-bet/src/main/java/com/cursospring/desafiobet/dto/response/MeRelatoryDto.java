package com.cursospring.desafiobet.dto.response;

public record MeRelatoryDto(
        UserResponseDto user,
        Integer number,
        Integer winGames,
        Integer loseGames
) {

}
