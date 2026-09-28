package io.github.cursodsousa.arquiteturaspring.toDos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer> {
    boolean existsByDescricao(String descricao);
}
