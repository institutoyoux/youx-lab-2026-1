package com.cursospring.productsapi.models.dto;

import com.cursospring.productsapi.models.enums.UserRole;

public record RegisterDto(
        String login,
        String password,
        UserRole role
) {
}
