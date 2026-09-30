package com.curso.libraryapi.controller.mappers;

import com.curso.libraryapi.controller.dto.CadastroLivroDTO;
import com.curso.libraryapi.controller.dto.ResultadoPesquisaLivroDTO;
import com.curso.libraryapi.model.Livro;
import com.curso.libraryapi.repository.AutorRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = AutorMapper.class)
public abstract class LivroMapper {

    @Autowired
    private AutorRepository autorRepository;

    @Mapping(target = "autor", expression = "java(autorRepository.findyById(dto.idAutor()).orElse(null))")
    public abstract Livro toEntity(CadastroLivroDTO dto);

    public abstract ResultadoPesquisaLivroDTO toDTO(Livro livro);
}
