package io.github.cursodsousa.arquiteturaspring.toDos;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private ToDoRepository repository;
    private ToDoValidator validator;
    private MailSender mailSender;

    public ToDoService(ToDoRepository toDoRepository,
                       ToDoValidator validator,
                       MailSender mailSender) {
        this.repository = toDoRepository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public ToDoEntity salvar(ToDoEntity novoToDo) {
        validator.validar(novoToDo);
        return repository.save(novoToDo);
    }

    public void atualizarStatus(ToDoEntity todo) {
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluído" : "Não oncluído";
        mailSender.enviar("To Do " + todo.getDescricao() + "foi atualizado para " + status);
    }

    public ToDoEntity buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
