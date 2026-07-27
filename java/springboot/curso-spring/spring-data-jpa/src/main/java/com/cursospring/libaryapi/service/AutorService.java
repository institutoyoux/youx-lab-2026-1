package com.cursospring.libaryapi.service;

import com.cursospring.libaryapi.model.Autor;
import com.cursospring.libaryapi.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AutorService {
    @Autowired
    private final AutorRepository repository;


    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public Autor salvar(Autor autor) {
        return repository.save(autor);
    }
    public Optional<Autor> obterPorId(UUID id) {
        return repository.findById(id);
    }

    public void deletar(Autor autor) {
        repository.delete(autor);
    }
}
