package com.cursospring.desafiobet.repositories;

import com.cursospring.desafiobet.model.reset.Reset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResetRepository extends JpaRepository<Reset, Long> {
    Optional<Reset> findByUserId(Long id);

    Optional<Reset> findByUserIdAndCode(Long userId, Integer code);
}
