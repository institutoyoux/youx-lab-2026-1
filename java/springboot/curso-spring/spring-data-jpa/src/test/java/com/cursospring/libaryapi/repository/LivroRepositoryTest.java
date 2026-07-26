package com.cursospring.libaryapi.repository;

import com.cursospring.libaryapi.model.Autor;
import com.cursospring.libaryapi.model.GeneroLivro;
import com.cursospring.libaryapi.model.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LivroRepositoryTest {
    @Autowired
    LivroRepository repository;
    @Autowired
    AutorRepository autorRepository;

    @Test
    void salvarTest(){
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("Outro Livro");
        livro.setDataPublicacao(LocalDate.of(1980, 1, 2));
        Autor autor = autorRepository.findById(UUID.fromString("a92dd57e-3846-4dfb-ac98-4857f2d1d926")).orElse(null);
        livro.setAutor(autor);
        repository.save(livro);
    }

    @Test
    void salvarAutorELivroCascadeTest(){
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("Terceiro Livro");
        livro.setDataPublicacao(LocalDate.of(1980, 1, 2));

        Autor autor = new Autor();
        autor.setNome("José");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of( 1951, 1, 31));
        autorRepository.save(autor);
        livro.setAutor(autor);
        repository.save(livro);
    }

    @Test
    void salvarCascadeTest(){
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("Outro Livro");
        livro.setDataPublicacao(LocalDate.of(1980, 1, 2));

        Autor autor = new Autor();
        autor.setNome("joão");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of( 1951, 1, 31));
        livro.setAutor(autor);
        repository.save(livro);
    }

    @Test
    void atualizarAutorDoLivro() {
        UUID id = UUID.fromString("5f9b8c53-eeab-480c-a47a-8a7620776f32");
        var livroParaAtualizar = repository.findById(id).orElse(null);
        UUID idAutor = UUID.fromString("7e8dc6ff-318c-47e8-bbfc-5cb7538cb0d0");
        Autor autor = autorRepository.findById(idAutor).orElse(null);
        livroParaAtualizar.setAutor(autor);
        repository.save(livroParaAtualizar);
    }

    @Test
    void deletar() {
        UUID id = UUID.fromString("5f9b8c53-eeab-480c-a47a-8a7620776f32");
        repository.deleteById(id);
    }
    @Test
    void deletarCascade() {
        UUID id = UUID.fromString("bcb69c00-5dce-4c7e-a996-351b96a17c8c");
        repository.deleteById(id);
    }
    @Test
    @Transactional
    void buscarLivroTest() {
        UUID id = UUID.fromString("14e281ae-455d-41bb-ac68-a4f4929f24e1");
        Livro livro = repository.findById(id).orElse(null);
        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor().getNome());
    }
}