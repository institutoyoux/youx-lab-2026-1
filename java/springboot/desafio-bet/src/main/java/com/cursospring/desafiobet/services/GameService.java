package com.cursospring.desafiobet.services;

import com.cursospring.desafiobet.exceptions.ErroGenericException;
import com.cursospring.desafiobet.exceptions.InvalidBodyRequestException;
import com.cursospring.desafiobet.model.enums.GameStatus;
import com.cursospring.desafiobet.model.game.Game;
import com.cursospring.desafiobet.model.user.User;
import com.cursospring.desafiobet.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository repository;
    private final UserService userService;
    public Game gerarJogoPorUser(User user, Double value) throws InvalidBodyRequestException {
        if (user.getBalance() < value) {
            throw new InvalidBodyRequestException("Saldo insuficiente!");
        }
        Optional<Game> optionalGame = repository.findByUserIdAndStatus(user.getId(), GameStatus.PENDING);
        if (optionalGame.isPresent()) {
            repository.delete(optionalGame.get());
        }
        Game newGame = new Game();
        newGame.setUser(user);
        List<Integer> cellsToAdd = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Random random = new Random();
            cellsToAdd.add(random.nextInt(0, 2));
        }
        newGame.setCells(cellsToAdd);
        newGame.setValue(value);
        newGame.setStatus(GameStatus.PENDING);
        user.setBalance(user.getBalance() - value);
        userService.salvar(user);
        return repository.save(newGame);
    }

    public Game abrirCell(Long id, Integer cell) {
        if (cell < 0 || cell > 24) {
            throw new InvalidBodyRequestException("Cell inválida!");
        }
        Optional<Game> optionalGame = repository.findByUserIdAndStatus(id, GameStatus.PENDING);
        if (optionalGame.isEmpty()) {
            throw new InvalidBodyRequestException("Jogo inexistente ou já encerrado!");
        }
        Game game = optionalGame.get();
        Integer cellOpen = game.getCells().get(cell);
        if (cellOpen == 0) {
            game.setStatus(GameStatus.LOSE);
        }
        if (cellOpen == 1) {
            game.openCell(cell);
        }
        return repository.save(game);
    }

    public void encerrarJogo(User user) {
        Optional<Game> optionalGame = repository.findByUserIdAndStatus(user.getId(), GameStatus.PENDING);
        if (optionalGame.isEmpty()) {
            throw new InvalidBodyRequestException("Jogo inexistente ou já encerrado!");
        }
        Game game = optionalGame.get();
        if (game.getOpenCells().size() < 1) {
            throw new ErroGenericException("É preciso abrir ao menos uma cell!");
        }
        Double ganho = game.getValue() * (1 + (game.getOpenCells().size() * 0.33));
        user.setBalance(user.getBalance() + ganho);
        userService.salvar(user);
        game.setStatus(GameStatus.WIN);
        repository.save(game);
    }

    public Integer obterQuantidadeJogos() {
        List<Game> consulta = repository.findAll();
        List<Game> todos = consulta.stream().filter(game -> game.getStatus() != GameStatus.PENDING).toList();
        return todos.size();
    }

    public Double obterRevShare() {
        List<Game> gamesWin = repository.findByStatus(GameStatus.WIN);
        List<Game> gamesLose = repository.findByStatus(GameStatus.LOSE);
        final Double[] valores = {0.0, 0.0};
        gamesWin.forEach(game -> valores[0] += game.getValue() * (1 + (game.getOpenCells().size() * 0.33)));
        gamesLose.forEach(game -> valores[1] += game.getValue());
        Double revShare = valores[1] - valores[0];
        return revShare;
    }

    public Page<Game> obterTodosGames(Pageable pageable) {
        return repository.findAll(pageable);
    }
    public Integer quantidadeJogosPorUser(User user) {
        return repository.findByUserId(user.getId()).get().size();
    }
    public Integer obterQuantPorStatus(GameStatus gameStatus) {
        return repository.findByStatus(gameStatus).size();
    }

    public Integer obterQuantPorUseEStatus(GameStatus gameStatus, User user) {
        return repository.findAllByUserIdAndStatus(user.getId(), gameStatus).get().size();
    }
}
