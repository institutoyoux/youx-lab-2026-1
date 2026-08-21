package com.cursospring.minitwitter.services;

import com.cursospring.minitwitter.models.like.Like;
import com.cursospring.minitwitter.models.user.User;
import com.cursospring.minitwitter.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Optional<User> buscarPorUsername(String username) {
        return repository.findByUsername(username);
    }

    public void addLike(Like like) {
        User user = buscarPorUsername(like.getUser().getUsername()).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        user.getLikes().add(like);
    }

    public void removeLike(Like like) {
        User user = buscarPorUsername(like.getUser().getUsername()).orElseThrow(() -> new IllegalArgumentException("Usuario não encontrado"));
        user.getLikes().remove(like);
    }
}
