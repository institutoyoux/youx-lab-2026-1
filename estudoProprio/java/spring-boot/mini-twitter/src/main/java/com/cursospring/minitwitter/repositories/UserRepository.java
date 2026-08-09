package com.cursospring.minitwitter.repositories;

import com.cursospring.minitwitter.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsernameOrEmail(String username, String email);

    User findByEmail(String email);

    User findByUsername(String username);
}
