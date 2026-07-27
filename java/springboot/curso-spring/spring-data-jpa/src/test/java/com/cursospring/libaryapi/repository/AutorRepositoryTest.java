package com.cursospring.libaryapi.repository;

import com.cursospring.libaryapi.model.Autor;
import com.cursospring.libaryapi.model.GeneroLivro;
import com.cursospring.libaryapi.model.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AutorRepositoryTest {
    @Autowired
    AutorRepository repository;

    @Autowired
    LivroRepository livroRepository;

    @Test
    public void salvarTest() {
        Autor autor = new Autor();
        autor.setNome("Maria");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of( 1951, 1, 31));
        var autorSalvo = repository.save(autor);
        System.out.println("Autor salvo: " + autorSalvo);
    }
    @Test
    public void atualizarTest() {
        var id = UUID.fromString("7e8dc6ff-318c-47e8-bbfc-5cb7538cb0d0");
        Optional<Autor> possivelAutor = repository.findById(id);
        if (possivelAutor.isPresent()) {
            Autor autorEncontrado = possivelAutor.get();
            System.out.println("Dados do autor: ");
            System.out.println(autorEncontrado);
            autorEncontrado.setDataNascimento(LocalDate.of(1960, 1, 30));
            repository.save(autorEncontrado);
        }
    }
    @Test
    public void listarTest() {
        List<Autor> lista = repository.findAll();
        lista.forEach(System.out::println);
    }
    @Test
    public void countTest() {
        System.out.println("Contage de autores: " + repository.count());
    }
    @Test
    public void deleteByIdTest() {
        var id = UUID.fromString("1705e1ec-511f-4d6e-baf7-de62e4140619");
        repository.deleteById(id);
    }
    @Test
    public void deleteTest() {
        var id = UUID.fromString("1705e1ec-511f-4d6e-baf7-de62e4140619");
        var maria = repository.findById(id).get();
        repository.delete(maria);
    }
    @Test
    void salvarAutorComLivrosTest() {
        Autor autor = new Autor();
        autor.setNome("Antonio");
        autor.setNacionalidade("Americana");
        autor.setDataNascimento(LocalDate.of(1970, 8, 5));


        Livro livro = new Livro();
        livro.setIsbn("12887-84874");
        livro.setPreco(BigDecimal.valueOf(200));
        livro.setGenero(GeneroLivro.MISTERIO);
        livro.setTitulo("o roubo da casa assombrada");
        livro.setDataPublicacao(LocalDate.of(1999, 1, 2));
        livro.setAutor(autor);

        Livro livro2 = new Livro();
        livro2.setIsbn("87557-84874");
        livro2.setPreco(BigDecimal.valueOf(140));
        livro2.setGenero(GeneroLivro.BIOGRAFIA);
        livro2.setTitulo("O dia de um CEO");
        livro2.setDataPublicacao(LocalDate.of(2017, 6, 20));
        livro2.setAutor(autor);

        autor.setLivros(new ArrayList<>());
        autor.getLivros().add(livro);
        autor.getLivros().add(livro2);

        repository.save(autor);
//        livroRepository.saveAll(autor.getLivros());
    }
}
