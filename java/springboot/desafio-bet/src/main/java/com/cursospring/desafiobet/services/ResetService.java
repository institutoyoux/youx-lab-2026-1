package com.cursospring.desafiobet.services;

import com.cursospring.desafiobet.model.reset.Reset;
import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.repositories.ResetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ResetService {
    private final ResetRepository repository;

    public Reset gerarCodePorUser(User user) {
        Optional<Reset> optional =  repository.findByUserId(user.getId());
        if (optional.isPresent()) {
            repository.delete(optional.get());
        }
        Reset newReset = new Reset();
        newReset.setUserId(user.getId());
        newReset.setCode(gerarCode());
        newReset.setExpireDate(genExpire());
        return repository.save(newReset);
    }
    private Integer gerarCode() {
        Random random = new Random();
        return random.nextInt(100000, 999999);
    }
    private Instant genExpire() {
        return LocalDateTime.now().plusMinutes(15).toInstant(ZoneOffset.of("-03:00"));
    }

    public Optional<Reset> buscarResetPorUserId(Long userId) {
        return repository.findByUserId(userId);
    }

    public Optional<Reset> buscarPorUserIdECode(Long userId, Integer code) {

        return repository.findByUserIdAndCode(userId, code);
    }

    public void apagar(Reset reset) {
        repository.delete(reset);
    }
}
