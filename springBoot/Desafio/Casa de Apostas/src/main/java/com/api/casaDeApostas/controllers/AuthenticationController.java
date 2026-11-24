package com.api.casaDeApostas.controllers;

import com.api.casaDeApostas.dtos.*;
import com.api.casaDeApostas.entities.User;
import com.api.casaDeApostas.enums.UserRole;
import com.api.casaDeApostas.infraSecurity.TokenService;
import com.api.casaDeApostas.infraSecurity.TokenServiceForgotPassword;
import com.api.casaDeApostas.infraSecurity.TokenServiceRegisterConfirmation;
import com.api.casaDeApostas.repositories.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final UserRepository repository;
    private final TokenService tokenService;
    private final PasswordEncoder passwordEncoder;
    private final TokenServiceRegisterConfirmation confirmationRegisterService;
    private final TokenServiceForgotPassword forgotPasswordService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody @Valid AuthenticationDTO data) {

        UsernamePasswordAuthenticationToken usernamePassword =
                new UsernamePasswordAuthenticationToken(
                        data.email(),
                        data.password()
                );

        Authentication auth = authenticationManager.authenticate(usernamePassword);

        String token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/forgotPassword")
    public ResponseEntity<Void> forgotPassword(
            @RequestBody @Valid ForgotPasswordDTO data) {

        Optional<User> user = repository.findByEmail(data.email());

        if (user.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        String token = forgotPasswordService.generatePasswordResetToken(user.get());

        System.out.println(token);

        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/validatePasswordResetToken")
    public ResponseEntity<String> validatePasswordResetToken(@RequestBody @Valid ValidatePasswordResetTokenDTO data) {

        String email = forgotPasswordService.validatePasswordResetToken(data.token());

        if (email.isBlank()) {
            return ResponseEntity.badRequest()
                    .body("Token inválido");
        }

        Optional<User> userOptional = repository.findByEmail(email);

        if (userOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        User user = userOptional.get();

        if (!Objects.equals(data.newPassword(), data.newPasswordConfirm())) {
            return ResponseEntity.badRequest().build();
        }

        user.setPassword(passwordEncoder.encode(data.newPassword()));
        repository.save(user);

        return ResponseEntity.ok().build();
    }


    @PostMapping("/register")
    public ResponseEntity<Void> register(
            @RequestBody @Valid RegisterDTO data) {

        if (repository.findByEmail(data.email()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

        if (!data.password().equals(data.passwordConfirm())) {
            return ResponseEntity.badRequest().build();
        }

        User newUser = new User();

        newUser.setName(data.name());
        newUser.setEmail(data.email());
        newUser.setNascDate(data.nascDate());
        newUser.setPassword(passwordEncoder.encode(data.password()));
        newUser.setRole(UserRole.USER);

        repository.save(newUser);

        String token = confirmationRegisterService.generateToken(newUser);

        String link = "http://localhost:8080/auth/confirm?token=" + token;

        System.out.println("Link de confirmação: " + link);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/confirmRegister")
    public ResponseEntity<String> confirmRegister(@RequestParam String token) {

        String email = confirmationRegisterService.validateToken(token);

        if (email.isBlank()) {
            return ResponseEntity.badRequest()
                    .body("Token inválido ou expirado");
        }

        Optional<User> userOptional = repository.findByEmail(email);

        if (userOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        User user = userOptional.get();

        if (user.isEnabled()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Cadastro já confirmado");
        }

        user.setEnabled(true);

        repository.save(user);

        return ResponseEntity.ok("Cadastro confirmado com sucesso!");
    }
}