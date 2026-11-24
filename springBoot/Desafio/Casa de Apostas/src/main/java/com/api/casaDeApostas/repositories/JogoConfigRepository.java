package com.api.casaDeApostas.repositories;

import com.api.casaDeApostas.configs.JogoConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogoConfigRepository
        extends JpaRepository<JogoConfig, UUID> {
}