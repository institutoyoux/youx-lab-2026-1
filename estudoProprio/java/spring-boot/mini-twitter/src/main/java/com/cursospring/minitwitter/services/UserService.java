package com.cursospring.minitwitter.services;

import com.cursospring.minitwitter.models.user.User;
import com.cursospring.minitwitter.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User buscarPorUsernameOuEmail(String login) {
        return repository.findByUsernameOrEmail(login, login);
    }

    public User buscarPorEmail(String email) {
        return repository.findByEmail(email);
    }

    public void salvar(User newUser) {
        repository.save(newUser);
    }

    public User buscarPorUsername(String username) {
        return repository.findByUsername(username);
    }
}
