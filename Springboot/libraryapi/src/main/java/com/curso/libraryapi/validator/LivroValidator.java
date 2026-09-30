package com.curso.libraryapi.validator;

import com.curso.libraryapi.exceptions.CampoInvalidoException;
import com.curso.libraryapi.exceptions.RegistroDuplicadoException;
import com.curso.libraryapi.model.Livro;
import com.curso.libraryapi.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LivroValidator {

    private static final int ANO_EXIGENCIA_PRECO = 2020;

    private final LivroRepository repository;

    public void validar(Livro livro) {
        if(existeLivroComIsbn(livro)) {
            throw new RegistroDuplicadoException("ISBN já cadastrado");
        }
        if(isPrecoObrigadorioIsNull(livro)) {
            throw new CampoInvalidoException("preco", "Para livros com ano de publicação a partir de 2020 o preco e obrigatorio");
        }
    }

    private boolean isPrecoObrigadorioIsNull(Livro livro) {
        return livro.getPreco() == null &&
                livro.getDataPublicacao().getYear() >= ANO_EXIGENCIA_PRECO;
    }

    private boolean existeLivroComIsbn(Livro livro) {
        Optional<Livro> livroEncontrado = repository.findByIsbn(livro.getIsbn());

        if(livro.getId() == null){
            return livroEncontrado.isPresent();
        }

        return livroEncontrado
                .map(Livro::getId)
                .stream()
                .anyMatch(id -> !id.equals(livro.getId()));
    }
}
