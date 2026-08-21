package com.api.tarefas.novaapitarefas.models;

import com.api.tarefas.novaapitarefas.models.enums.StatusTarefa;
import com.api.tarefas.novaapitarefas.models.enums.TipoTarefa;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tarefas")
@Data
@NoArgsConstructor
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private TipoTarefa tipo;
    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;
    @Column(name = "data_termino", nullable = false)
    private LocalDate dataTermino;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusTarefa status;
}
