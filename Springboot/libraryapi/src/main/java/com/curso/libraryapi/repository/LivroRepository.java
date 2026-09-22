package com.curso.libraryapi.repository;

import com.curso.libraryapi.model.Autor;
import com.curso.libraryapi.model.GeneroLivro;
import com.curso.libraryapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 * @see LivroRepositoryTest
 */

public interface LivroRepository extends JpaRepository<Livro, UUID> {

    // Query Method
    // select * from livro where id_autor = id

    List<Livro> findByAutor(Autor autor);
    List<Livro> findByTitulo(String titulo);

    List<Livro> findByIsbn(String isbn);

    List<Livro> findByTituloAndPreco(String titulo, BigDecimal preco);

    List<Livro> findByTituloOrIsbnOrderByTitulo(String titulo, String isbn);

    List<Livro> findByDataPublicacaoBetween(LocalDate  inicio, LocalDate fim);

//    JPQL -> referencia as entidades e as propriedades

    @Query("select l from Livro as l order by l.titulo, l.preco")
    List<Livro> listarTodosOrdenadosPorTituloAndPreco();
    @Query("select a from Livro l join l.autor a")
    List<Autor> listarAutoresDosLivros();

    @Query("select distinct l.titulo from Livro l " )
    List<String> listarNomesDiferentesLivros();

    @Query("""
        select l.genero 
        from Livro l
        join l.autor a
        where a.nacionalidade = 'Brasileira'
        order by l.genero
    """)
    List<String> listarGenerosAutoresBrasileiros();

    // named parameters -> parametros nomeados

    @Query("select l from Livro l where l.genero = :genero order by :paramOrdenacao")
    List<Livro> findByGenero(
            @Param("genero") GeneroLivro generoLivro,
            @Param("paramOrdenacao") String nomePropriedade);
    // positional parameters

    @Query("select l from Livro l where l.genero = ?1 order by ?2 ")
    List<Livro> findByGeneroPositionalParameters(GeneroLivro generoLivro, String nomePropriedade);
    @Modifying
    @Transactional
    @Query(" delete from Livro where genero = ?1 ")
    void deleteByGenero(GeneroLivro genero);

    @Modifying
    @Transactional
    @Query(" update  Livro set dataPublicacao = ?1 ")
    void updateDataPublicacao(LocalDate novaData);

    boolean existsByAutor(Autor autor);
}
