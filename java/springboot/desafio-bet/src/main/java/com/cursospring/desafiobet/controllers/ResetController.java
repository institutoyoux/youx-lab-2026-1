package com.cursospring.desafiobet.controllers;

import com.cursospring.desafiobet.dto.request.CodeAndPasswordDto;
import com.cursospring.desafiobet.dto.request.EmailDto;
import com.cursospring.desafiobet.dto.response.ErrorResponseDto;
import com.cursospring.desafiobet.model.reset.Reset;
import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.services.ResetService;
import com.cursospring.desafiobet.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

import static com.cursospring.desafiobet.components.VerifyPass.isValidPass;

@RestController
@RequestMapping("/reset")
@RequiredArgsConstructor
@CrossOrigin
public class ResetController {
    private final UserService userService;
    private final ResetService resetService;

    @PostMapping("/request")
    public ResponseEntity<Reset> criarReset(@RequestBody @Valid EmailDto emailDto) {
        Optional<User> optional = userService.buscarPorEmail(emailDto.email());
        if (optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        User user = optional.get();
        resetService.gerarCodePorUser(user);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Object> validateCode(@RequestBody @Valid CodeAndPasswordDto dto) {
        Optional<User> userOptional = userService.buscarPorEmail(dto.email());
        Optional<Reset> resetOptional = resetService.buscarResetPorUserId(userOptional.get().getId());
        if (userOptional.isEmpty() || resetOptional.isEmpty() || resetOptional.get().getExpireDate().isBefore(LocalDateTime.now().toInstant(ZoneOffset.of("-03:00")))) {
            return ResponseEntity.badRequest().body(new ErrorResponseDto("Código invalido ou expirado"));
        }
        User user = userOptional.get();
        if (resetService.buscarPorUserIdECode(user.getId(), dto.code()).isEmpty()) {
            return ResponseEntity.badRequest().body(new ErrorResponseDto("Código invalido ou expirado"));
        }
        if (!isValidPass(dto.password())) {
            throw new BadCredentialsException("Senha invalida!");
        }
        String encryptedPassword = new BCryptPasswordEncoder().encode(dto.password());
        user.setPassword(encryptedPassword);

//        userService.salvar(user);
        resetService.apagar(resetOptional.get());
        return ResponseEntity.ok().build();
    }
}
