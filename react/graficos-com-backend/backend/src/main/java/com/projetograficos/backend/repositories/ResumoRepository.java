package com.projetograficos.backend.repositories;

import com.projetograficos.backend.models.Resumo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ResumoRepository extends JpaRepository<Resumo, UUID> {
}
