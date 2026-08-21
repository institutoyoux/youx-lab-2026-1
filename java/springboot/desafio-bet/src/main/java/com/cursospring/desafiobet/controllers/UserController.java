package com.cursospring.desafiobet.controllers;

import com.cursospring.desafiobet.dto.response.MeRelatoryDto;
import com.cursospring.desafiobet.dto.response.UserResponseDto;
import com.cursospring.desafiobet.model.enums.GameStatus;
import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.services.GameService;
import com.cursospring.desafiobet.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/me")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    private final UserService userService;
    private final GameService gameService;

    @GetMapping
    public ResponseEntity<MeRelatoryDto> relatorio(Authentication authentication) {
        User user = (User) authentication.getPrincipal();
        Integer todos = gameService.quantidadeJogosPorUser(user);
        Integer wins = gameService.obterQuantPorUseEStatus(GameStatus.WIN, user);
        Integer loses = gameService.obterQuantPorUseEStatus(GameStatus.LOSE, user);
        UserResponseDto userDto = new UserResponseDto(user.getId(), user.getEmail(), user.getDataNascimento(), user.getBalance(), user.isBlocked());
        return ResponseEntity.ok(new MeRelatoryDto(userDto,todos, wins, loses));
    }
}
