package com.curso.libraryapi.service;

import com.curso.libraryapi.model.Autor;
import com.curso.libraryapi.model.GeneroLivro;
import com.curso.libraryapi.model.Livro;
import com.curso.libraryapi.repository.AutorRepository;
import com.curso.libraryapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class TransacaoService {

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private LivroRepository livroRepository;

    @Transactional
    public void salvarLivroComFoto() {

    }

    @Transactional
    public void atualizacoaSemAtualizar(){
        var livro = livroRepository
                .findById(UUID.fromString("975e78fd-05a3-41a1-8147-6562b2e5aa5a"))
                .orElse(null);

        livro.setDataPublicacao(LocalDate.of(2004, 6, 1));

    }

    @Transactional
    public void executar(){
        // salva o autor
        Autor autor = new Autor();
        autor.setNome("Teste Francisco");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1951, 1, 31));

        autorRepository.save(autor);

        // salva o livro
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("Teste Livro da Francisco");
        livro.setDataPublicacao(LocalDate.of(1980, 1, 2));

        livro.setAutor(autor);

        livroRepository.save(livro);

        if(autor.getNome().equals("Teste Francisco")) {
            throw new RuntimeException("Rollback!");
        }
    }
}
