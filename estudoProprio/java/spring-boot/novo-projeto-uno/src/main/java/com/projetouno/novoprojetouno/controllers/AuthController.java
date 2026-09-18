package com.projetouno.novoprojetouno.controllers;

import com.projetouno.novoprojetouno.dto.CadastroDTO;
import com.projetouno.novoprojetouno.dto.LoginDTO;
import com.projetouno.novoprojetouno.dto.TokenRespostaDTO;
import com.projetouno.novoprojetouno.dto.UsuarioDTO;
import com.projetouno.novoprojetouno.models.Usuario;
import com.projetouno.novoprojetouno.security.TokenService;
import com.projetouno.novoprojetouno.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {
    private final UsuarioService usuarioService;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<TokenRespostaDTO> login(@RequestBody @Valid LoginDTO dto) {
        String token = usuarioService.gerarTokenPorDto(dto);
        return ResponseEntity.ok().body(new TokenRespostaDTO(token));
    }

    @PostMapping("/signup")
    public ResponseEntity<Void> signup(@RequestBody @Valid CadastroDTO dto) {
        usuarioService.criarPorDTO(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping
    public ResponseEntity<UsuarioDTO> sobreMim(Authentication authentication) {
        Usuario usuario = (Usuario) authentication.getPrincipal();
        usuario = usuarioService.buscarPorUsername(usuario.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado!"));
        return ResponseEntity.ok().body(new UsuarioDTO(usuario.getUsername(), usuario.getCartas()));
    }
}
