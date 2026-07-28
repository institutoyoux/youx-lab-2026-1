package com.cursospring.libaryapi.repository;

import com.cursospring.libaryapi.model.Autor;
import com.cursospring.libaryapi.model.GeneroLivro;
import com.cursospring.libaryapi.model.Livro;
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
    // Query method
    List<Livro> findByAutor(Autor autor);

    List<Livro> findByTitulo(String titulo);

    List<Livro> findByIsbn(String isbn);

    List<Livro> findByTituloAndPreco(String titulo, BigDecimal preco);

    List<Livro> findByTituloOrIsbnOrderByTitulo(String titulo, String isbn);

    List<Livro> findByDataPublicacaoBetween(LocalDate dataInicio, LocalDate dataFim);

    // select l.* from livro as l order by l.titulo
    @Query("select l from Livro as l order by l.titulo, l.preco")  // ao escrever esqueça a estrutura sql, deve se usar a estrtura/nomes do java
    List<Livro> listarOrdenandoPorTituloAndPreco();

    @Query("select a from Livro l join l.autor a")
    List<Autor> listarAutoresLivros();

    @Query("select distinct l.titulo from Livro l ")
    List<String> listarNomesDiferentesLivros();

    @Query("""
        select l.genero
        from Livro l
        join l.autor a
        where a.nacionalidade = 'Brasileira'
        order by l.genero
        """)
    List<String> listarGeneroAutoresBrasileiros();

    // named parameters
    @Query("select l.genero from Livro l where l.genero = :nomeDoParam ")
    List<String> findByGenero(@Param("nomeDoParam") GeneroLivro generoLivro);

    // positional parameters
    @Query("select l.genero from Livro l where l.genero = ?1 ")
    List<String> findByGeneroPositional(GeneroLivro generoLivro);

    @Modifying
    @Transactional
    @Query("delete from Livro l where genero = :genero")
    void deleteByGenero(@Param("genero") GeneroLivro gen);

    @Modifying
    @Transactional
    @Query("update Livro set dataPublicacao = :nova")
    void updateDataPublicacao(@Param("nova") LocalDate novaData);
    boolean existsByAutor(Autor autor);
}
