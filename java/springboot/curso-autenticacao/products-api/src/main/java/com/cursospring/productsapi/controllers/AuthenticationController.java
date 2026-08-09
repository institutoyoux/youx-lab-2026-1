package com.cursospring.productsapi.controllers;

import com.cursospring.productsapi.models.User;
import com.cursospring.productsapi.models.dto.AuthenticationDto;
import com.cursospring.productsapi.models.dto.LoginResponseDto;
import com.cursospring.productsapi.models.dto.RegisterDto;
import com.cursospring.productsapi.models.enums.UserRole;
import com.cursospring.productsapi.repositories.UserRepository;
import com.cursospring.productsapi.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository repository;
    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDto authDto){
        var usernamePassword = new UsernamePasswordAuthenticationToken(authDto.login(), authDto.password());
        var auth = authenticationManager.authenticate(usernamePassword);
        var token = tokenService.generateToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponseDto(token));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDto registerDto){
        if (repository.findByLogin(registerDto.login()) != null) {
            return ResponseEntity.badRequest().build();
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDto.password());

        User newUser = new User(registerDto.login(), encryptedPassword, registerDto.role());
        repository.save(newUser);
        return ResponseEntity.ok().build();
    }
}
