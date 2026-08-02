package com.cursospring.libaryapi.controller.mappers;

import com.cursospring.libaryapi.controller.dto.CadastroLivroDTO;
import com.cursospring.libaryapi.controller.dto.ResultadoPesquisaLivroDTO;
import com.cursospring.libaryapi.model.Livro;
import com.cursospring.libaryapi.repository.AutorRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = AutorMapper.class)
public abstract class LivroMapper {

    @Autowired
    AutorRepository autorRepository;

    @Mapping(target = "autor", expression = "java( autorRepository.findById(dto.idAutor()).orElse(null) )")
    public abstract Livro toEntity(CadastroLivroDTO dto);

    public abstract ResultadoPesquisaLivroDTO toDTO(Livro livro);
}
