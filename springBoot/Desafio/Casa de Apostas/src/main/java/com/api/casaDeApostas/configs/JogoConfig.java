package com.api.casaDeApostas.configs;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "jogo_config")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JogoConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private Integer quantidadeDeBombas;
}