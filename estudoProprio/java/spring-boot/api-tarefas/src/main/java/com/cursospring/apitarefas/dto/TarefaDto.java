package com.cursospring.apitarefas.dto;

import com.cursospring.apitarefas.model.enums.StatusTarefa;
import com.cursospring.apitarefas.model.enums.TipoTarefa;

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
