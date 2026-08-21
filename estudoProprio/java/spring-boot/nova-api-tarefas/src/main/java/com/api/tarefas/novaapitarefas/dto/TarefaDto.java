package com.api.tarefas.novaapitarefas.dto;

import com.api.tarefas.novaapitarefas.models.enums.StatusTarefa;
import com.api.tarefas.novaapitarefas.models.enums.TipoTarefa;

import java.time.LocalDate;
import java.util.UUID;

public record TarefaDto(
        UUID id,
        String nome,
        TipoTarefa tipo,
        LocalDate dataCadastro,
        LocalDate dataTermino,
        StatusTarefa status
) {
}
