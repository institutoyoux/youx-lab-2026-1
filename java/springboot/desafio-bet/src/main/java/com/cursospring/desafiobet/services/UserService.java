package com.cursospring.desafiobet.services;

import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public Optional<User> buscarPorEmail(String email) {
        return repository.findByEmail(email);
    }

    public User salvar(User user) {
        return repository.save(user);
    }

    public void bloquear(User user) {
        user.setBlocked(true);
        repository.save(user);
    }
    public void desbloquear(User user) {
        user.setBlocked(false);
        repository.save(user);
    }

    public Optional<User> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Page<User> obterTodosUser(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
