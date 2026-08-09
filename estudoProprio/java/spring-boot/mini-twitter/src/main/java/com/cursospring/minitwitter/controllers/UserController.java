package com.cursospring.minitwitter.controllers;

import com.cursospring.minitwitter.models.user.User;
import com.cursospring.minitwitter.models.user.dto.UserResponseDto;
import com.cursospring.minitwitter.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/me")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity getMe(Authentication authentication) {
        String username = authentication.getName();
        User user = userService.buscarPorUsername(username);
        UserResponseDto response = new UserResponseDto(user.getId(), user.getUsername(), user.getEmail(), user.getUrlFoto());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/posts")
    public ResponseEntity getMePosts(Authentication authentication) {
        String username = authentication.getName();
        return ResponseEntity.ok(userService.buscarPorUsername(username).getPosts());
    }
}
