package com.curso.libraryapi.controller.mappers;

import com.curso.libraryapi.controller.dto.CadastroLivroDTO;
import com.curso.libraryapi.controller.dto.ResultadoPesquisaLivroDTO;
import com.curso.libraryapi.model.Livro;
import com.curso.libraryapi.repository.AutorRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = AutorMapper.class)
public abstract class LivroMapper {

    public AutorRepository autorRepository;

    @Mapping(target = "autor", expression = "java(autorRepository.findById(dto.idAutor()).orElse(null))")
    public abstract Livro toEntity(CadastroLivroDTO dto);

    public abstract ResultadoPesquisaLivroDTO toDTO(Livro livro);
}
