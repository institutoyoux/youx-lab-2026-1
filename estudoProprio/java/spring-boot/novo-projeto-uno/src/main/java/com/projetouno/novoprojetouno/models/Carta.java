package com.projetouno.novoprojetouno.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cartas")
@NoArgsConstructor
@Data
public class Carta {
    @Id
    private Integer id;
    private Integer numero;
    @Enumerated(EnumType.STRING)
    private CoresCartaEnum cor;
}