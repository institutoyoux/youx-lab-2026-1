package com.cursospring.desafiobet.controllers;

import com.cursospring.desafiobet.dto.response.DrashboardResponseDto;
import com.cursospring.desafiobet.dto.response.UserResponseDto;
import com.cursospring.desafiobet.model.game.Game;
import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.services.GameService;
import com.cursospring.desafiobet.services.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final GameService gameService;
    private final UserService userService;

    @GetMapping("/drashboard")
    public ResponseEntity<DrashboardResponseDto> relatorio() {
        return ResponseEntity.ok(new DrashboardResponseDto(gameService.obterQuantidadeJogos(), gameService.obterRevShare()));
    }
    @PostMapping("/block/{id}")
    public ResponseEntity<Object> bloquearUsuario(@PathVariable Long id) {
        Optional<User> userOptional = userService.buscarPorId(id);
        if (userOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        userService.bloquear(userOptional.get());
        return ResponseEntity.ok().build();
    }
    @PostMapping("/unblock/{id}")
    public ResponseEntity<Object> desbloquearUsuario(@PathVariable Long id) {
        Optional<User> userOptional = userService.buscarPorId(id);
        if (userOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        userService.desbloquear(userOptional.get());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/allusers")
    public ResponseEntity<Page<UserResponseDto>> getAllPosts(
            @PageableDefault(size = 10) Pageable pageable,
            Authentication authentication
    ) {
        Page<User> todosUser = userService.obterTodosUser(pageable);

        return ResponseEntity.ok(todosUser.map(user -> new UserResponseDto(user.getId(), user.getEmail(), user.getDataNascimento(), user.getBalance(), user.isBlocked())));
    }
}
