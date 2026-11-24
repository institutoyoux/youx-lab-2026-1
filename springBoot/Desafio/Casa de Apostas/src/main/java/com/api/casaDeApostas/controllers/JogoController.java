package com.api.casaDeApostas.controllers;

import com.api.casaDeApostas.dtos.*;
import com.api.casaDeApostas.entities.User;
import com.api.casaDeApostas.services.JogoConfigService;
import com.api.casaDeApostas.services.JogoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/jogo")
public class JogoController {

    private final JogoConfigService jogoConfigService;
    private final JogoService jogoService;

    public JogoController(JogoConfigService jogoConfigService, JogoService jogoService) {
        this.jogoConfigService = jogoConfigService;
        this.jogoService = jogoService;
    }

    @PostMapping("/iniciar")
    public ResponseEntity<CriarJogoResponseDTO> iniciarJogo(@AuthenticationPrincipal User user,
                                                            @RequestBody @Valid CriarJogoDTO dto) {

        return ResponseEntity.ok(jogoService.criarJogo(user, dto));
    }

    @PatchMapping("/configurar")
    public ResponseEntity<Void> configurar(@RequestBody @Valid ConfigurarJogoDTO data) {

        jogoConfigService.configurar(data.quantidadeDeBombas());

        return ResponseEntity.ok().build();
    }

    @PostMapping("/{jogoId}/selecionar")
    public ResponseEntity<SelecionarPosicaoResponseDTO> selecionarPosicao(@PathVariable UUID jogoId,
                                                                          @RequestBody @Valid SelecionarPosicaoDTO data,
                                                                          @AuthenticationPrincipal User user
    ) {
        System.out.println(user.getEmail());
        return ResponseEntity.ok(
                jogoService.selecionarPosicao(
                        jogoId,
                        user,
                        data.numeroPosicao()
                )
        );
    }

    @PatchMapping("/{jogoId}/finalizar")
    public ResponseEntity<SelecionarPosicaoResponseDTO> finalizarJogo(@PathVariable UUID jogoId,
                                                                      @AuthenticationPrincipal User user
    ) {

        return ResponseEntity.ok(
                jogoService.finalizarJogo(jogoId, user)
        );
    }
}