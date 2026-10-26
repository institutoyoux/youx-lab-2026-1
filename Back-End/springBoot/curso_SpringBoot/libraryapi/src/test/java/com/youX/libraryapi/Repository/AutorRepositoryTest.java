package com.youX.libraryapi.Repository;

import com.youX.libraryapi.model.Autor;
import com.youX.libraryapi.repository.AutorRepository;
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
    public void salvarTest(){
        Autor autor = new Autor();
        autor.setNome("João");
        autor.setNascionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1951, 6, 13));

        var autorSalvo = repository.save(autor);
        System.out.println("Autor Salvo: " + autorSalvo);

    }

    @Test
    public void atualizarTest(){
        var id = UUID.fromString("a1806f90-8ec9-4c47-b395-eec0f149a0e6");

        Optional<Autor> possivelAutor = repository.findById(id);

        if(possivelAutor.isPresent()){
            Autor autorEncontrado = possivelAutor.get();
            System.out.println("Dados do Autor: ");
            System.out.println(autorEncontrado);

            autorEncontrado.setDataNascimento(LocalDate.of(1960,1,1));

            repository.save(autorEncontrado);
        }
    }
    @Test
    public void listarTeste(){
        List<Autor> list = repository.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void countTest(){
        System.out.println("Contagem de autores: " + repository.count());
    }

    @Test
    public void deletePorIdTest(){
        var id = UUID.fromString("a1806f90-8ec9-4c47-b395-eec0f149a0e6");
        repository.deleteById(id);
    }

    @Test
    public void deleteTest(){
        var id = UUID.fromString("7f842a2e-00c8-47aa-b396-94f89d63cb53");
        var maria = repository.findById(id).get();
        repository.delete(maria);
    }
}
