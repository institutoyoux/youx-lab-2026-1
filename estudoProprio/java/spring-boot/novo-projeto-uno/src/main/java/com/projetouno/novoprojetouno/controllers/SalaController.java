package com.projetouno.novoprojetouno.controllers;

import com.projetouno.novoprojetouno.dto.*;
import com.projetouno.novoprojetouno.models.Sala;
import com.projetouno.novoprojetouno.models.Usuario;
import com.projetouno.novoprojetouno.services.SalaService;
import com.projetouno.novoprojetouno.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sala")
@RequiredArgsConstructor
@CrossOrigin
public class SalaController {
    private final SalaService salaService;
    private final UsuarioService usuarioService;

    @PostMapping("/criar")
    public ResponseEntity<SalaDTO> criarSala(Authentication authentication) {
        Usuario usuario = (Usuario) authentication.getPrincipal();
        usuario = usuarioService.buscarPorUsername(usuario.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado!"));
        Sala sala = salaService.criarSala(usuario);
        SalaDTO dto = new SalaDTO(
                sala.getCartaAtual(),
                new BaralhoDTO(sala.getBaralho().getCartas()),
                new UsuarioDTO(
                        sala.getJogador1().getUsername(),
                        sala.getJogador1().getCartas()
                ),
                null,
                sala.getCodigo(),
                sala.getVezJogador1()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @PostMapping("/jogar")
    public ResponseEntity<Void> jogarCarta(@RequestBody JogarCartaDTO dto, Authentication authentication) {
        Usuario authUser = (Usuario) authentication.getPrincipal();
        Usuario usuario = usuarioService.buscarPorUsername(authUser.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado!"));
        salaService.jogarCartas(usuario, dto.cartas());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<SalaDTO> obterDadosSala(@PathVariable("codigo") Integer codigo) {
        Sala sala = salaService.obterPorCodigo(codigo)
                .orElseThrow(() -> new IllegalArgumentException("Sala não encontrada!"));

        UsuarioDTO jogador2 = null;
        if (sala.getJogador2() != null) {
            jogador2 =
                    new UsuarioDTO(
                            sala.getJogador2().getUsername(),
                            sala.getJogador2().getCartas()
                    );
        }

        SalaDTO dto = new SalaDTO(
                sala.getCartaAtual(),
                new BaralhoDTO(sala.getBaralho().getCartas()),
                new UsuarioDTO(
                        sala.getJogador1().getUsername(),
                        sala.getJogador1().getCartas()
                ),
                jogador2,
                sala.getCodigo(),
                sala.getVezJogador1()
        );
        return ResponseEntity.ok(dto);
    }



    @PostMapping("/entrar")
    public  ResponseEntity<Void> entrarSala(@RequestBody @Valid EntrarSalaDTO dto, Authentication authentication) {
        Usuario authUser = (Usuario) authentication.getPrincipal();
        Usuario usuario = usuarioService.buscarPorUsername(authUser.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado!"));
        salaService.entrarSala(usuario, dto.codigo());
        return ResponseEntity.ok().build();
    }
    @PostMapping("/comprar")
    public ResponseEntity<Void> comprarCarta(Authentication authentication) {
        Usuario authUser = (Usuario) authentication.getPrincipal();
        Usuario usuario = usuarioService.buscarPorUsername(authUser.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado!"));
        salaService.comprarCarta(usuario);
        return ResponseEntity.ok().build();
    }
}
