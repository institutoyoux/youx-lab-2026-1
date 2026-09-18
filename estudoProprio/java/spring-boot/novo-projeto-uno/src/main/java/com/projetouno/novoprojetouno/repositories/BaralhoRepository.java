package com.projetouno.novoprojetouno.repositories;

import com.projetouno.novoprojetouno.models.Baralho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BaralhoRepository extends JpaRepository<Baralho, UUID> {
}
