package com.cursospring.minitwitter.models.post.dto;

import jakarta.validation.constraints.NotBlank;

public record PostCreateDto(
        @NotBlank
        String conteudo
) {
}
