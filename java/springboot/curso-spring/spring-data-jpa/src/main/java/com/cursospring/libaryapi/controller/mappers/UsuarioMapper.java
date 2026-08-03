package com.cursospring.libaryapi.controller.mappers;

import com.cursospring.libaryapi.controller.dto.UsuarioDTO;
import com.cursospring.libaryapi.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    Usuario toEntity(UsuarioDTO dto);
}
