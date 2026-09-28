package io.github.cursodsousa.arquiteturaspring.toDos;

import org.springframework.stereotype.Component;

@Component
public class ToDoValidator {

    private ToDoRepository repository;

    public ToDoValidator(ToDoRepository repository) {
        this.repository = repository;
    }

    public void validar(ToDoEntity toDo) {
        if (existeToDoComEssaDescricao(toDo.getDescricao())){
            throw new IllegalArgumentException("Já existe um TO DO com essa descrição");
        }
    }

    private boolean existeToDoComEssaDescricao(String descricao) {
        return repository.existsByDescricao(descricao);
    }
}
