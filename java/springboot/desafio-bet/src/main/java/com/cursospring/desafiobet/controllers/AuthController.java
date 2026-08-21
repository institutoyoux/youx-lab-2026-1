package com.cursospring.desafiobet.controllers;
import com.cursospring.desafiobet.dto.request.UserLoginDto;
import com.cursospring.desafiobet.dto.request.UserRegisterDto;
import com.cursospring.desafiobet.dto.response.TokenResponseDto;
import com.cursospring.desafiobet.exceptions.UserAlreadyExistsException;
import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.model.user.UserRole;
import com.cursospring.desafiobet.security.TokenService;
import com.cursospring.desafiobet.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

import static com.cursospring.desafiobet.components.VerifyPass.isValidPass;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity<TokenResponseDto> login(@RequestBody @Valid UserLoginDto loginDto) {
        UsernamePasswordAuthenticationToken user = new UsernamePasswordAuthenticationToken(
                loginDto.email(),
                loginDto.password()
        );
        Authentication auth = authenticationManager.authenticate(user);
        String token = tokenService.generateToken((User) Objects.requireNonNull(auth.getPrincipal()));
        return ResponseEntity.ok(new TokenResponseDto(token));
    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody @Valid UserRegisterDto registerDto){
        if (userService.buscarPorEmail(registerDto.email()).isPresent()) {
            throw new UserAlreadyExistsException("Este email já está em uso!");
        }
        if (!isValidPass(registerDto.password())) {
            throw new BadCredentialsException("Senha invalida!");
        }
        if (!Objects.equals(registerDto.confirmPass(), registerDto.password())) {
            throw new BadCredentialsException("As senhas não se concidem");
        }
        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDto.password());

        User newUser = new User();
        newUser.setNome(registerDto.nome());
        newUser.setEmail(registerDto.email());
        newUser.setDataNascimento(registerDto.data_nascimento());
        newUser.setPassword(encryptedPassword);
        newUser.setUserRole(UserRole.USER);
        newUser.setBlocked(false);
        userService.salvar(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
