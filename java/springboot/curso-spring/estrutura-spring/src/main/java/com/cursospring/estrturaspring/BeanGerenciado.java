package com.cursospring.estrturaspring;

import com.cursospring.estrturaspring.todos.TodoEntity;
import com.cursospring.estrturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope("singleton")
//@Scope("request")
//@Scope("session")
//@Scope("application")
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    @Autowired
    private AppProperties properties;

    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
        String variavel = properties.getVariavel();
    }

    public void ultilizar() {
        var todo = new TodoEntity();
        validator.validar(todo);
    }
    public void setValidator(TodoValidator validator) {
        this.validator = validator;
    }
}
