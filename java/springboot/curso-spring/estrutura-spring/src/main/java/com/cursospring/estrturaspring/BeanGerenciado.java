package com.cursospring.estrturaspring;

import com.cursospring.estrturaspring.todos.TodoEntity;
import com.cursospring.estrturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("request")
//@Scope("session")
//@Scope("application")
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void ultilizar() {
        var todo = new TodoEntity();
        validator.validar(todo);
    }
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }
}
