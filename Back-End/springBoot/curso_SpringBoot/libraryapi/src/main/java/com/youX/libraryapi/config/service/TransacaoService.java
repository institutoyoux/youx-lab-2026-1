package com.youX.libraryapi.config.service;

import com.youX.libraryapi.model.Autor;
import com.youX.libraryapi.model.GeneroLivro;
import com.youX.libraryapi.model.Livro;
import com.youX.libraryapi.repository.AutorRepository;
import com.youX.libraryapi.repository.LivroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class TransacaoService {

    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private LivroRepository livroRepository;

    @Transactional
    public void executar(){
        // salva o autor
        Autor autor = new Autor();
        autor.setNome("Default");
        autor.setNascionalidade("Default");
        autor.setDataNascimento(LocalDate.of(1000,1,1));

        autorRepository.save(autor);

        // salva o livro
        Livro livro = new Livro();
        livro.setIsbn("10000-10000");
        livro.setPreco(BigDecimal.valueOf(1));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("Default");
        livro.setDataPublicacao(LocalDate.of(1000,1,1));

        livro.setAutor(autor);

        livroRepository.save(livro);


    }
}
