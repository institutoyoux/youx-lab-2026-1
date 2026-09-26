package com.projetos.backend.controllers;

import com.projetos.backend.dto.CriarUsuarioDTO;
import com.projetos.backend.dto.UsuarioDTO;
import com.projetos.backend.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@CrossOrigin
public class UsuarioController {
    private final UsuarioService usuarioService;
    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> obterTodosUsuarios() {
        return ResponseEntity.ok(usuarioService.obterTodos());
    }
    @PostMapping
    public ResponseEntity<Void> criarUsuario(@ModelAttribute CriarUsuarioDTO dto) {
       usuarioService.criarPorDto(dto);
       return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}