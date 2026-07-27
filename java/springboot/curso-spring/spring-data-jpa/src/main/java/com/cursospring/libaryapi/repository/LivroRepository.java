package com.cursospring.libaryapi.repository;

import com.cursospring.libaryapi.model.Autor;
import com.cursospring.libaryapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
    // Query method
    List<Livro> findByAutor(Autor autor);
}
