package com.cursospring.libaryapi.controller.dto;

import com.cursospring.libaryapi.model.Autor;

import java.time.LocalDate;

public record AutorDTO(String nome, LocalDate dataNascimento, String nacionalidade) {
    public Autor mapearAutor() {
        Autor autor = new Autor();
        autor.setNome(this.nome);
        autor.setDataNascimento(this.dataNascimento);
        autor.setNacionalidade(this.nacionalidade);
        return autor;
    }
}
