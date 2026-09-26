package com.projetos.backend.dto;

import org.springframework.web.multipart.MultipartFile;

public record CriarUsuarioDTO(
        String nome,
        String username,
        MultipartFile foto,
        MultipartFile comprovante
) {
}
