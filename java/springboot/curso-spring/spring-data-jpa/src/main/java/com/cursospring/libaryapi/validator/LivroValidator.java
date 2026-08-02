package com.cursospring.libaryapi.validator;

import com.cursospring.libaryapi.exceptions.CampoInvalidoException;
import com.cursospring.libaryapi.exceptions.RegistroDuplicadoException;
import com.cursospring.libaryapi.model.Livro;
import com.cursospring.libaryapi.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LivroValidator {
    private final LivroRepository repository;
    private static final int ANO_EXIGENCIA_PRECO = 2020;

    public void validar(Livro livro) {
        if (existeLivroComIsbn(livro)) {
            throw new RegistroDuplicadoException("ISBN já cadastrado!");
        }

        if (isPrecoObrigatorioNulo(livro)) {
            throw new CampoInvalidoException("preco", "Para Livros com ano de publicação a partir de 2020 o preço é obrigatório");
        }
    }

    private boolean isPrecoObrigatorioNulo(Livro livro) {
        return livro.getPreco() == null && livro.getDataPublicacao().getYear() >= ANO_EXIGENCIA_PRECO;
    }

    private boolean existeLivroComIsbn(Livro livro) {
        Optional<Livro> livroEncontrado = repository.findByIsbn(livro.getIsbn());
        if (livro.getId() == null) {
            return livroEncontrado.isPresent();
        }
        return livroEncontrado
                .map(Livro::getId)
                .stream()
                .anyMatch(id -> !id.equals(livro.getId()));

    }
}
