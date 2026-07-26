package com.cursospring.libaryapi.repository;

import com.cursospring.libaryapi.model.Autor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AutorRepositoryTest {
    @Autowired
    AutorRepository repository;

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
}
