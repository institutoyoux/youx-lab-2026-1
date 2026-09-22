package com.curso.libraryapi.validator;

import com.curso.libraryapi.exceptions.RegistroDuplicadoException;
import com.curso.libraryapi.model.Autor;
import com.curso.libraryapi.repository.AutorRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AutorValidator {

    private AutorRepository repository;

    public AutorValidator(AutorRepository repository) {
        this.repository = repository;
    }

    public void validar(Autor autor) {
        if (existeAutorCadastrado(autor)){
            throw new RegistroDuplicadoException("Autor já cadastrado");
        }
    }

    private boolean existeAutorCadastrado(Autor autor){
        Optional<Autor> autorEncotrado = repository.findByNomeAndDataNascimentoAndNacionalidade(
                autor.getNome(), autor.getDataNascimento(), autor.getNacionalidade()
        );

        if (autor.getId() == null) {
            return autorEncotrado.isPresent();
        }

        return !autor.getId().equals(autorEncotrado.get().getId()) && autorEncotrado.isPresent();
    }
}
