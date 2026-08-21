package com.api.tarefas.novaapitarefas.controllers;

import com.api.tarefas.novaapitarefas.dto.TarefaDto;
import com.api.tarefas.novaapitarefas.models.Tarefa;
import com.api.tarefas.novaapitarefas.services.TarefaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tarefas")
@RequiredArgsConstructor
@CrossOrigin
public class TarefaController {
    private final TarefaService tarefaService;
    @GetMapping
    public ResponseEntity<List<TarefaDto>> getAll() {
        List<TarefaDto> tarefas = tarefaService.getAll().stream().map(tarefa -> new TarefaDto(tarefa.getId(), tarefa.getNome(), tarefa.getTipo(), tarefa.getDataCadastro(), tarefa.getDataTermino(), tarefa.getStatus())).toList();
        return ResponseEntity.ok(tarefas);
    }
    @PostMapping
    public ResponseEntity<Void> criarTarefa(@RequestBody @Valid TarefaDto authDto) {
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(authDto.nome());
        tarefa.setTipo(authDto.tipo());
        tarefa.setDataCadastro(authDto.dataCadastro());
        tarefa.setDataTermino(authDto.dataTermino());
        tarefa.setStatus(authDto.status());
        tarefaService.salvarTarefa(tarefa);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable("id") UUID id) {
        Tarefa tarefa = tarefaService.buscarPorId(id);
        tarefaService.deletar(tarefa);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarTarefa(@PathVariable("id") UUID id, @RequestBody @Valid TarefaDto authDto) {
        Tarefa tarefa = new Tarefa();
        tarefa.setId(id);
        tarefa.setNome(authDto.nome());
        tarefa.setTipo(authDto.tipo());
        tarefa.setDataCadastro(authDto.dataCadastro());
        tarefa.setDataTermino(authDto.dataTermino());
        tarefa.setStatus(authDto.status());
        tarefaService.salvarTarefa(tarefa);
        return ResponseEntity.accepted().build();
    }
}
