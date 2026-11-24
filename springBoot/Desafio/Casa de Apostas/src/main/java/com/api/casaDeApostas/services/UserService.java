package com.api.casaDeApostas.services;

import com.api.casaDeApostas.dtos.UserDTO;
import com.api.casaDeApostas.entities.User;
import com.api.casaDeApostas.enums.UserRole;
import com.api.casaDeApostas.repositories.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll(UserDTO userDTO) {
        return repository.findAll();
    }

    public void updateBlocked(UUID id, boolean blocked) {

        User user = repository.findById(id)
                .orElseThrow(() ->
                        new UsernameNotFoundException("Usuário não encontrado")
                );

        if (user.getRole() != UserRole.USER) {
            throw new IllegalArgumentException(
                    "Somente usuários USER podem ser bloqueados"
            );
        }

        user.setBlocked(blocked);

        repository.save(user);
    }

    public User save(User user) {
        return repository.save(user);
    }
}
