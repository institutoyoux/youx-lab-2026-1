package io.github.cursodsousa.libraryapi.service;

import io.github.cursodsousa.libraryapi.model.Autor;
import io.github.cursodsousa.libraryapi.model.GeneroLivro;
import io.github.cursodsousa.libraryapi.model.Livro;
import io.github.cursodsousa.libraryapi.repository.AutorRepository;
import io.github.cursodsousa.libraryapi.repository.LivroRepository;
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
    public void salvarLivroComFoto(){

    }

    @Transactional
    public void atualizacaoSemAtualizar(){
        var livro = livroRepository
                .findById(UUID.fromString("4d8d5ada-e100-44fd-82e9-48c696ef0903"))
                .orElse(null);
        livro.setDataPublicacao(LocalDate.of(2026, 10, 15));
    }

    @Transactional
    public void executar(){

        Autor autor = new Autor();
        autor.setNome("Teste Paim");
        autor.setNacionalidade("Brasileiro");
        autor.setDataNascimento(LocalDate.of(1951, 1, 31));

        autor = autorRepository.save(autor);

        Livro livro = new Livro();
        livro.setIsbn("978-85-65622-00-4");
        livro.setPreco(BigDecimal.valueOf(68));
        livro.setGenero(GeneroLivro.BIOGRAFIA);
        livro.setTitulo("Teste careca");
        livro.setDataPublicacao(LocalDate.of(2012, 3, 20));

        livro.setAutor(autor);

        livroRepository.save(livro);

        if(autor.getNome().equals("Teste Paim")){
            throw new RuntimeException("Rollback!");
        }

    }
}
