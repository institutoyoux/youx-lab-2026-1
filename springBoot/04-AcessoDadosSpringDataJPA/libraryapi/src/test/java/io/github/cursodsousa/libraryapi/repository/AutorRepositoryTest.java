package io.github.cursodsousa.libraryapi.repository;

import io.github.cursodsousa.libraryapi.model.Autor;
import io.github.cursodsousa.libraryapi.model.GeneroLivro;
import io.github.cursodsousa.libraryapi.model.Livro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

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
        autor.setNome("Jiraya");
        autor.setNacionalidade("Konoha");
        autor.setDataNascimento(LocalDate.of(1951, 1, 31));

        var autorSalvo = repository.save(autor);
        System.out.println("Autor salvo: " + autorSalvo);
    }

    @Test
    public void atualizarTest(){
        var id = UUID.fromString("62b4f868-b7a5-4edc-a50b-2fb113604562");

        Optional<Autor> possivelAutor = repository.findById(id);

        if  (possivelAutor.isPresent()) {

            Autor autorEncontrado = possivelAutor.get();
            System.out.println("Dados do autor: ");
            System.out.println(possivelAutor.get());

            autorEncontrado.setDataNascimento(LocalDate.of(1960, 1, 30));

            repository.save(autorEncontrado);
        }
    }

    @Test
    public void listarTest(){
        List<Autor> lista = repository.findAll();
        lista.forEach(System.out::println);
    }

    @Test
    public void countTest(){
        System.out.println("Contagem de autores: " + repository.count());
    }

    @Test
    public void deletePorIdTest(){
        var id = UUID.fromString("35aeff70-b275-4fa8-b48f-0d89f479a3d2");
        var maria = repository.findById(id).get();
        repository.delete(maria);
    }

    @Test
    void SalvarAutorComLivrosTest(){
        Autor autor = new Autor();
        autor.setNome("Tatsuki Fujimoto");
        autor.setNacionalidade("Japonesa");
        autor.setDataNascimento(LocalDate.of(1992, 10, 10));

        Livro livro = new Livro();
        livro.setIsbn("978-6525948102");
        livro.setPreco(BigDecimal.valueOf(48));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("Chainsaw Man Vol.23");
        livro.setDataPublicacao(LocalDate.of(2026, 8, 15));
        livro.setAutor(autor);

        Livro livro2 = new Livro();
        livro2.setIsbn("2-978-6525902517");
        livro2.setPreco(BigDecimal.valueOf(47));
        livro2.setGenero(GeneroLivro.FICCAO);
        livro2.setTitulo("Chainsaw Man Vol.9");
        livro2.setDataPublicacao(LocalDate.of(2022, 7, 29));
        livro2.setAutor(autor);

        autor.setLivros(new ArrayList<>());
        autor.getLivros().add(livro);
        autor.getLivros().add(livro2);
        repository.save(autor);

        livroRepository.saveAll(autor.getLivros());
    }

    @Test
    @Transactional
    void listarLivrosAutor(){
        var id = UUID.fromString("e3c65e27-20c5-4fc8-80d1-3461729cb118");
        var autor = repository.findById(id).get();

        List<Livro> livrosLista = livroRepository.findByAutor(autor);
        autor.setLivros(livrosLista);

        autor.getLivros().forEach(System.out::println);
    }
}
