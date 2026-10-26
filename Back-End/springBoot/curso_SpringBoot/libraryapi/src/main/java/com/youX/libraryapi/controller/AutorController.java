package com.youX.libraryapi.controller;

import com.youX.libraryapi.model.Autor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("autores")
// http:/localhost:8080/autores
public class AutorController {

    @PostMapping
    public Object salvar(














            Autor autor){

        return new ResponseEntity("Autor Salvo com sucesso!", HttpStatus.CREATED);
    }


}
