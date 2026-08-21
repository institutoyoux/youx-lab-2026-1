package com.cursospring.minitwitter.models.user.dto;

import java.util.UUID;

public record ProfileResponseDto(
        UUID id,
        String username,
        String urlFoto
) {
}
