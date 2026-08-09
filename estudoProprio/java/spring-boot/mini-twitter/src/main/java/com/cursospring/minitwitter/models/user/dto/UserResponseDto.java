package com.cursospring.minitwitter.models.user.dto;

import java.util.UUID;

public record UserResponseDto(
        UUID id,
        String username,
        String email,
        String urlFoto
) {
}
