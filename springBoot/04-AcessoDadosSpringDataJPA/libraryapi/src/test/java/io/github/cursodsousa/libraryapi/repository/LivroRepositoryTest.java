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
import java.util.List;
import java.util.UUID;

@SpringBootTest
class LivroRepositoryTest {

    @Autowired
    LivroRepository repository;

    @Autowired
    AutorRepository autorRepository;

    @Test
    void SalvarTest() {
        Livro livro = new Livro();
        livro.setIsbn("978-85-65622-00-4");
        livro.setPreco(BigDecimal.valueOf(68));
        livro.setGenero(GeneroLivro.CIENCIA);
        livro.setTitulo("Anfíbios e Répteis: Introdução ao Estudo da Herpetofauna Brasileira");
        livro.setDataPublicacao(LocalDate.of(2012, 3, 20));

        Autor autor = autorRepository
                .findById(UUID.fromString("c436cdb3-f840-4e01-b04e-1dabf5c80f20"))
                .orElse(null);

        livro.setAutor(autor);

        repository.save(livro);
    }

    @Test
    void SalvarCascadeTest() {
        Livro livro = new Livro();
        livro.setIsbn("978-85-65622-00-4");
        livro.setPreco(BigDecimal.valueOf(68));
        livro.setGenero(GeneroLivro.CIENCIA);
        livro.setTitulo("Anfíbios e Répteis: Introdução ao Estudo da Herpetofauna Brasileira");
        livro.setDataPublicacao(LocalDate.of(2012, 3, 20));

        Autor autor = new Autor();
        autor.setNome("Paulo Sérgio Bernarde");
        autor.setNacionalidade("Brasileiro");
        autor.setDataNascimento(LocalDate.of(1951, 1, 31));

        autor = autorRepository.save(autor);
        livro.setAutor(autor);

        repository.save(livro);
    }

    @Test
    void atualizarAutorDoLivro() {
        UUID id = UUID.fromString("8edb0f27-58ea-4b30-a304-fcb4102e3312");
        var livroParaAtualizar = repository.findById(id).orElse(null);

        UUID idAutor = UUID.fromString("25a9bb71-b50c-4939-bc13-7120e5345121");
        Autor maria = autorRepository.findById(idAutor).orElse(null);

        livroParaAtualizar.setAutor(maria);

        repository.save(livroParaAtualizar);
    }

    @Test
    void deletar() {
        UUID id = UUID.fromString("4026df29-6030-46df-8d68-5bc275a9958c");
        repository.deleteById(id);
    }

    @Test
    void deletarCascade() {
        UUID id = UUID.fromString("18d078ad-9bbd-419b-b744-46c0ae3ad6b0");
        repository.deleteById(id);
    }

    @Test
    @Transactional
    void buscarLivroTest() {
        UUID id = UUID.fromString("5980416e-9425-479d-a49b-9df952056175");
        Livro livro = repository.findById(id).orElse(null);
        System.out.println("Livro: ");
        System.out.println(livro.getTitulo());

        System.out.println("Autor: ");
        System.out.println(livro.getAutor().getNome());
    }

    @Test
    void pesquisaPorTituloTest() {
        List<Livro> lista = repository.findByTitulo("Less smoka pra mim");
        lista.forEach(System.out::println);
    }

    @Test
    void pesquisaPorISBNTest() {
        List<Livro> lista = repository.findByIsbn("9318106-720715");
        lista.forEach(System.out::println);
    }

    @Test
    void pesquisaPorTituloEPrecoTest() {
        var preco = BigDecimal.valueOf(100.00);
        var tituloPesquisa = "manual do capa e gelo agachado";

        List<Livro> lista = repository.findByTituloAndPreco(tituloPesquisa, preco);
        lista.forEach(System.out::println);
    }

    @Test
    void pesquisaPorTituloOuISBNTest(){
        var tituloPesquisa = "Chainsaw Man Vol.9";
        var isbnPesquisa = "2-978-6525902517";

        List<Livro> lista = repository.findByTituloOrIsbn(tituloPesquisa, isbnPesquisa);
        lista.forEach(System.out::println);
    }

    @Test
    void pesquisarEntreDatas(){
        LocalDate inicio = LocalDate.of(1980, 01, 02);
        LocalDate fim = LocalDate.now();

        List<Livro> lista = repository.findByDataPublicacaoBetween(inicio, fim);
        lista.forEach(System.out::println);
    }

    @Test
    void listarLivrosComQueryJPQL(){
        var resultado = repository.listarTodosOrdenadoPorTituloAndPreco();
        resultado.forEach(System.out::println);
    }

    @Test
    void listarAutoresDosLivros(){
        var resultado = repository.listarAutoresDosLivros();
        resultado.forEach(System.out::println);
    }

    @Test
    void listarTitulosNaoRepetidosDosLivros(){
        var resultado = repository.listarNomesDiferentesLivros();
        resultado.forEach(System.out::println);
    }

    @Test
    void listarGenerosDeLivrosAutoresBrasileirassos(){
        var resultado = repository.listarGenerosAutoresBrasileiros();
        resultado.forEach(System.out::println);
    }

    @Test
    void listarPorGeneroQueryParamTest(){
        var resultado = repository.findByGenero(GeneroLivro.FICCAO, "dataPublicacao");
        resultado.forEach(System.out::println);
    }

    @Test
    void listarPorGeneroPositionalParamTest(){
        var resultado = repository.findByGeneroPositionalParameters(GeneroLivro.MANGA, "dataPublicacao");
        resultado.forEach(System.out::println);
    }

    @Test
    void deleteTest(){
        repository.deleteByGenero(GeneroLivro.CIENCIA);
    }

    @Test
    void updateTituloTest(){
        repository.updateByTitulo(
                "sei lá oq²",
                UUID.fromString("39759249-3890-476b-a0f2-76a4036a5ea4"
                ));
    }

}
