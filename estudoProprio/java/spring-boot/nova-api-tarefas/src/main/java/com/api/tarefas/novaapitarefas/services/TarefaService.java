package com.api.tarefas.novaapitarefas.services;

import com.api.tarefas.novaapitarefas.dto.TarefaDto;
import com.api.tarefas.novaapitarefas.models.Tarefa;
import com.api.tarefas.novaapitarefas.repositories.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TarefaService {
    private final TarefaRepository repository;
    public List<Tarefa> getAll() {
        return repository.findAll();
    }

    public void salvarTarefa(Tarefa tarefa) {
        repository.save(tarefa);
    }

    public Tarefa buscarPorId(UUID id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Tarefa não encontrada!"));
    }

    public void deletar(Tarefa tarefa) {
        repository.delete(tarefa);
    }
}
