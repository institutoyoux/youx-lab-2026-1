package com.cursospring.apitarefas.controller;

import com.cursospring.apitarefas.model.Tarefa;
import com.cursospring.apitarefas.repository.TarefaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("tarefas")
@RequiredArgsConstructor
@CrossOrigin
public class TarefaController {
    private final TarefaRepository repository;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody Tarefa tarefa) {
        repository.save(tarefa);
        URI loc = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(tarefa.getId())
                .toUri();
        return ResponseEntity.created(loc).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@RequestBody Tarefa tarefaReq, @PathVariable("id") String idUrl) {
        UUID id = UUID.fromString(idUrl);
        Optional<Tarefa> tarefa = repository.findById(id);
        if (tarefa.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Tarefa tarefaAtualizar = tarefa.get();
        tarefaAtualizar.setNome(tarefaReq.getNome());
        tarefaAtualizar.setTipo(tarefaReq.getTipo());
        tarefaAtualizar.setDataCadastro(tarefaReq.getDataCadastro());
        tarefaAtualizar.setDataTermino(tarefaReq.getDataTermino());
        tarefaAtualizar.setStatus(tarefaReq.getStatus());
        repository.save(tarefaAtualizar);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> apagar(@PathVariable("id") String idReq) {
        UUID id = UUID.fromString(idReq);
        Optional<Tarefa> possivel = repository.findById(id);
        if (possivel.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Tarefa tarefa = possivel.get();
        repository.delete(tarefa);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<Object> obterTodas() {
        List<Tarefa> tarefas = repository.findAll();
        return ResponseEntity.ok(tarefas);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> obterTarefa(@PathVariable("id") String idReq) {
        UUID id = UUID.fromString(idReq);
        Optional<Tarefa> tarefa = repository.findById(id);
        if (tarefa.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(tarefa.get());
    }
}