package com.cursospring.desafiobet.repositories;

import com.cursospring.desafiobet.model.enums.GameStatus;
import com.cursospring.desafiobet.model.game.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GameRepository extends JpaRepository<Game, UUID> {
    Optional<Game> findByUserIdAndStatus(Long userId, GameStatus gameStatus);
    Optional<List<Game>> findByUserId(Long userId);

    List<Game> findByStatus(GameStatus gameStatus);

    Optional<List<Game>> findAllByUserIdAndStatus(Long id, GameStatus gameStatus);
}
