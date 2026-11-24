package com.api.casaDeApostas.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record ValidatePasswordResetTokenDTO(
        @NotBlank
        String token,

        @NotBlank(message = "A senha é obrigatória")
        @Size(min = 8, max = 64, message = "A senha deve ter entre 8 e 64 caracteres")
        @Pattern(
                regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",
                message = "A senha deve conter letras maiúsculas, minúsculas, números e caracteres especiais"
        )
        String newPassword,

        @NotBlank
        String newPasswordConfirm
) {
}