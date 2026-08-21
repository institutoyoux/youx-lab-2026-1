package com.cursospring.desafiobet.model.game;

import com.cursospring.desafiobet.exceptions.InvalidBodyRequestException;
import com.cursospring.desafiobet.model.enums.GameStatus;
import com.cursospring.desafiobet.model.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "games")
@Data
@EqualsAndHashCode(of = "id")
@RequiredArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ElementCollection
    private List<Integer> cells = new ArrayList<>();
    @ElementCollection
    private List<Integer> openCells = new ArrayList<>();
    @Column(name = "value_bet")
    private Double value;
    @Enumerated(EnumType.STRING)
    private GameStatus status;

    public void openCell(Integer index) {
        if (openCells.contains(index)) {
            throw new InvalidBodyRequestException("Cell já aberta!");
        } else {
            System.out.println(index);
        }
        openCells.add(index);
    }
}
// ideia q tive: fazer um random de 0 e 1, se for 0 = bomba, se for 1 = diamante! e fazer um for de 25 e adicionar ao list