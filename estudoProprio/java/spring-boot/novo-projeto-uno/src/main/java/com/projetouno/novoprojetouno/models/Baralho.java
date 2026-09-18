package com.projetouno.novoprojetouno.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "baralhos")
@NoArgsConstructor
@Data
public class Baralho {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToMany
    @JoinTable(
            name = "carta_baralho",
            joinColumns = @JoinColumn(name = "baralho_id"),
            inverseJoinColumns = @JoinColumn(name = "carta_id")
    )
    private List<Carta> cartas;
    @OneToOne
    @JoinColumn(name = "id_sala")
    private Sala sala;
}
