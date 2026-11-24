package com.api.casaDeApostas.repositories;

import com.api.casaDeApostas.entities.Jogo;
import com.api.casaDeApostas.enums.ResultadoJogo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface JogoRepository extends JpaRepository<Jogo, UUID> {
    List<Jogo> findAllByResultado(ResultadoJogo resultadoJogo);

    Integer countByUserId(UUID userId);

    Integer countByUserIdAndResultado(
            UUID userId,
            ResultadoJogo resultado
    );

    //fzr com sql nativo

}