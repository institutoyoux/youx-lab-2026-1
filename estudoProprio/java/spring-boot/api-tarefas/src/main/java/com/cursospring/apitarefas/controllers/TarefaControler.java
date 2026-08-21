package com.cursospring.apitarefas.controllers;

import com.cursospring.apitarefas.dto.TarefaDto;
import com.cursospring.apitarefas.services.TarefaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tarefas")
@RequiredArgsConstructor
public class TarefaControler {
    private final TarefaService tarefaService;
    @GetMapping
    public ResponseEntity<List<TarefaDto>> obterTodasTarefas() {
        List<TarefaDto> tarefas = tarefaService.all().stream().map(tarefa -> new TarefaDto(tarefa.getId(), tarefa.getNome(), tarefa.getTipo(), tarefa.getDataCadastro(), tarefa.getDataTermino(), tarefa.getStatus())).toList();
        return ResponseEntity.ok(tarefas);
    }
}
