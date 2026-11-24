package com.api.casaDeApostas.dtos;

import com.api.casaDeApostas.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String name;

    @Email(message = "Formato de e-mail inválido")
    @NotBlank(message = "O e-mail é obrigatório")
    private String email;

    @NotNull(message = "A data de nascimento é obrigatória")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate nascDate;

    @NotBlank(message = "A senha é obrigatória")
    @Size(min = 8, max = 64, message = "A senha deve ter entre 8 e 64 caracteres")
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",
            message = "A senha deve conter letras maiúsculas, minúsculas, números e caracteres especiais"
    )
    private String password;

    @NotBlank
    private String passwordConfirm;

    @NotNull(message = "O perfil do usuário é obrigatório")
    private UserRole role;
}
