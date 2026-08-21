package com.cursospring.apitarefas.services;


import com.cursospring.apitarefas.model.Tarefa;
import com.cursospring.apitarefas.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TarefaService {
    private final TarefaRepository repository;

    public List<Tarefa> all() {
        return repository.findAll();
    }
}
