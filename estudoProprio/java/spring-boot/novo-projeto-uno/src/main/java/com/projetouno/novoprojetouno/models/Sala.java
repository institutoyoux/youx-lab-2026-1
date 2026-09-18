package com.projetouno.novoprojetouno.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "salas")
@Data
@NoArgsConstructor
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToOne
    @JoinColumn(name = "carta_atual")
    private Carta cartaAtual;
    @OneToOne
    @JoinColumn(name = "id_baralho")
    private Baralho baralho;
    @ManyToOne
    @JoinColumn(name = "id_jogador1")
    private Usuario jogador1;
    @ManyToOne
    @JoinColumn(name = "id_jogador2")
    private Usuario jogador2;
    private Integer codigo;
    @Column(name = "vez_j1")
    private Boolean vezJogador1;
}