package com.projetouno.novoprojetouno.repositories;

import com.projetouno.novoprojetouno.models.Sala;
import com.projetouno.novoprojetouno.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SalaRepository extends JpaRepository<Sala, UUID> {
    List<Sala> findByJogador1OrJogador2(Usuario jogador1, Usuario jogador2);

    Optional<Sala> findByCodigo(Integer codigo);
}
