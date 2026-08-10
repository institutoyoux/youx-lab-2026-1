package com.cursospring.minitwitter.models.post.dto;

import com.cursospring.minitwitter.models.user.dto.UserResponseDto;

import java.time.Instant;
import java.util.UUID;

public record PostResponseDto(
        UUID id,
        Instant data_criacao,
        String conteudo,
        Integer likes,
        Boolean liked,
        UserResponseDto user
) {
}
