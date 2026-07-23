package com.cursospring.aula.repository;

import com.cursospring.aula.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepositoy extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
