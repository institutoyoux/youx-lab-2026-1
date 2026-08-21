package com.cursospring.desafiobet.dto.request;

import jakarta.validation.constraints.Email;

public record EmailDto(
        @Email
        String email
) {
}
