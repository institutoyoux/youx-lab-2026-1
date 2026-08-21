package com.cursospring.desafiobet.controllers;

import com.cursospring.desafiobet.dto.request.NewGameDto;
import com.cursospring.desafiobet.dto.request.OpenCellDto;
import com.cursospring.desafiobet.dto.response.GameDtoResponse;
import com.cursospring.desafiobet.exceptions.InvalidBodyRequestException;
import com.cursospring.desafiobet.model.enums.GameStatus;
import com.cursospring.desafiobet.model.game.Game;
import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.services.GameService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
@CrossOrigin
public class GameController {

    private final GameService gameService;

    @PostMapping("/new")
    public ResponseEntity<Void> newGame(@RequestBody @Valid NewGameDto dto, Authentication authentication) {
        if (dto.value() < 1) {
            throw new InvalidBodyRequestException("O valor minimo para aposta é 1 R$"); // centavos?
        }
        gameService.gerarJogoPorUser((User) Objects.requireNonNull(authentication.getPrincipal()), dto.value());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/open")
    public ResponseEntity<GameDtoResponse> openCell(@RequestBody @Valid OpenCellDto openCellDto, Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        Game gameOpen = gameService.abrirCell(user.getId(),openCellDto.cell());
        return ResponseEntity.ok().body(new GameDtoResponse(gameOpen.getStatus(), gameOpen.getOpenCells(), gameOpen.getValue()));
    }

    @PostMapping("/close")
    public ResponseEntity<Void> closeGame(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        gameService.encerrarJogo(user);
        return ResponseEntity.ok().build();
    }
}
