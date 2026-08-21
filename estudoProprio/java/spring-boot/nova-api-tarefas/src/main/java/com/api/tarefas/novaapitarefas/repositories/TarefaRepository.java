package com.api.tarefas.novaapitarefas.repositories;

import com.api.tarefas.novaapitarefas.models.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TarefaRepository extends JpaRepository<Tarefa, UUID> {
}
