package com.projetograficos.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "resumos")
@NoArgsConstructor
@Getter
@Setter
public class Resumo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate data;
    private Double ganhos;
    private Double perdas;
}
