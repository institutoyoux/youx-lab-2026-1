package com.api.casaDeApostas.repositories;

import com.api.casaDeApostas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    boolean existsByEmailAndPassword(String email, String password);

    Optional<User> findByEmail(String email);
}
