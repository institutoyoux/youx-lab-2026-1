package com.cursospring.libaryapi.controller;

import com.cursospring.libaryapi.controller.dto.CadastroLivroDTO;
import com.cursospring.libaryapi.controller.dto.ErroResposta;
import com.cursospring.libaryapi.controller.mappers.LivroMapper;
import com.cursospring.libaryapi.exceptions.RegistroDuplicadoException;
import com.cursospring.libaryapi.model.Livro;
import com.cursospring.libaryapi.service.LivroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("livros")
@RequiredArgsConstructor
public class LivroController implements GenericController {

    private final LivroService service;
    private final LivroMapper mapper;

    @PostMapping
    public ResponseEntity<Object> salvar(@RequestBody @Valid CadastroLivroDTO dto) {
        try {
            Livro livro = mapper.toEntity(dto);
            service.salvar(livro);
            var url = gerarHeaderLocation(livro.getId());
            return ResponseEntity.created(url).build();
        } catch (RegistroDuplicadoException e) {
            var erroDto = ErroResposta.conflito(e.getMessage());
            return ResponseEntity.status(erroDto.status()).body(erroDto);
        }
    }
}
