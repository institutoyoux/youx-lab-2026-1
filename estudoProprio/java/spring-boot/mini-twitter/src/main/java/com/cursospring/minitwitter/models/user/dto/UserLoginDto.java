package com.cursospring.minitwitter.models.user.dto;

public record UserLoginDto(
        String login,
        String password
) {
}
