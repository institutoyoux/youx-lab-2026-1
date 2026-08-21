package com.cursospring.apitarefas.model;

import com.cursospring.apitarefas.model.enums.StatusTarefa;
import com.cursospring.apitarefas.model.enums.TipoTarefa;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tarefas")
@Data
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
