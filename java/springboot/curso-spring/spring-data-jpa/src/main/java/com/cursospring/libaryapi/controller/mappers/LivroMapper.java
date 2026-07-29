package com.cursospring.libaryapi.controller.mappers;

import com.cursospring.libaryapi.controller.dto.CadastroLivroDTO;
import com.cursospring.libaryapi.model.Livro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {
    Livro toEntity(CadastroLivroDTO dto);
}
