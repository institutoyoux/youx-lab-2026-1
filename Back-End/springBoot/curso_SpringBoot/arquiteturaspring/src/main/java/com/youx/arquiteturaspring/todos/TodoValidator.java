package com.youx.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        if(existeTodoComEstaDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe Todo com esta descrição!");
        }

    }
    private boolean existeTodoComEstaDescricao(String descricao){
        return repository.existsByDescricao(descricao);
    }
}
