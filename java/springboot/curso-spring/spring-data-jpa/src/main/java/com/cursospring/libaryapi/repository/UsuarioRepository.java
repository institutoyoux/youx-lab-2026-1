package com.cursospring.libaryapi.repository;

import com.cursospring.libaryapi.model.Usuario;
import jakarta.validation.constraints.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    Usuario findByLogin(String login);

    Usuario findByEmail(String email);
}
