package io.github.cursodsousa.arquiteturaspring;

import io.github.cursodsousa.arquiteturaspring.toDos.ToDoEntity;
import io.github.cursodsousa.arquiteturaspring.toDos.ToDoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

//@Lazy(false)
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Scope(WebApplicationContext.SCOPE_APPLICATION)
//@Scope("request")
//@Scope("session")
//@Scope("application")
public class BeanGerenciado {

    private String idUsuarioLogado;

    @Autowired
    private ToDoValidator validator;

    @Autowired
    public BeanGerenciado(ToDoValidator validator) {
        this.validator = validator;
    }

    public void utilizar(){
        var todo = new ToDoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(ToDoValidator validator){
        this.validator = validator;
    }
}