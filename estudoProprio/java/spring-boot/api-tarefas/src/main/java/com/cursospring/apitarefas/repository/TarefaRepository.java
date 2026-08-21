package com.cursospring.apitarefas.repository;


import com.cursospring.apitarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TarefaRepository extends JpaRepository<Tarefa, UUID> {

}
