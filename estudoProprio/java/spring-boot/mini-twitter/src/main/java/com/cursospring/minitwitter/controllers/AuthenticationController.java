package com.cursospring.minitwitter.controllers;

import com.cursospring.minitwitter.exceptions.CampoAlreadyExistsException;
import com.cursospring.minitwitter.models.user.User;
import com.cursospring.minitwitter.models.user.UserRole;
import com.cursospring.minitwitter.models.user.dto.TokenResponseDto;
import com.cursospring.minitwitter.models.user.dto.UserLoginDto;
import com.cursospring.minitwitter.models.user.dto.UserRegisterDto;
import com.cursospring.minitwitter.security.TokenService;
import com.cursospring.minitwitter.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthenticationController {
    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid UserLoginDto loginDto) {
        var user = new UsernamePasswordAuthenticationToken(loginDto.login(), loginDto.password());
        var auth = authenticationManager.authenticate(user);
        var token = tokenService.generateToken((User) auth.getPrincipal());
        return ResponseEntity.ok(new TokenResponseDto(token));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid UserRegisterDto registerDto){
        if (userService.buscarPorEmail(registerDto.email()) != null) {
            throw new CampoAlreadyExistsException("Este email já está em uso!");
        }
        if (userService.buscarPorUsername(registerDto.username()) != null) {
            throw new CampoAlreadyExistsException("Este username já está em uso!");
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDto.password());

        User newUser = new User(registerDto.username(), registerDto.email(), encryptedPassword, UserRole.USER);
        userService.salvar(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
