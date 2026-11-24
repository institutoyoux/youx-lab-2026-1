package com.api.casaDeApostas.controllers;

import com.api.casaDeApostas.entities.User;
import com.api.casaDeApostas.repositories.UserRepository;
import com.api.casaDeApostas.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService service;
    private final UserRepository repository;

    //listar usuários
    @GetMapping
    public ResponseEntity getAllUsers() {
        List<User> userList = this.repository.findAll().stream().map(User::new).toList();

        return ResponseEntity.ok(userList);
    }

}
