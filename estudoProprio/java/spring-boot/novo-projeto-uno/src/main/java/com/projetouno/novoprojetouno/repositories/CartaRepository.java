package com.projetouno.novoprojetouno.repositories;

import com.projetouno.novoprojetouno.models.Carta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaRepository extends JpaRepository<Carta, Integer> {
}
