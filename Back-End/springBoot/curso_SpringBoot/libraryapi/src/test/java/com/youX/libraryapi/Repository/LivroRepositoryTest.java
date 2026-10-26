package com.youX.libraryapi.Repository;

import com.youX.libraryapi.model.Autor;
import com.youX.libraryapi.model.GeneroLivro;
import com.youX.libraryapi.model.Livro;
import com.youX.libraryapi.repository.AutorRepository;
import com.youX.libraryapi.repository.LivroRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@SpringBootTest
class LivroRepositoryTest {

    @Autowired
    LivroRepository repository;
    @Autowired
    AutorRepository autorRepository;

    @Test
    void salvarTest() {
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("UFO");
        livro.setDataPublicacao(LocalDate.of(1980, 1, 2));

        Autor autor = autorRepository
                .findById(UUID.fromString("7f842a2e-00c8-47aa-b396-94f89d63cb53"))
                .orElse(null);

        livro.setAutor(autor);

        repository.saveAndFlush(livro);
    }
}