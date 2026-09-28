package io.github.cursodsousa.arquiteturaspring.toDos;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class ToDoController {

    private ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @PostMapping
    public ToDoEntity salvar(@RequestBody ToDoEntity toDo) {
        try {
            return this.service.salvar(toDo);
        }catch (IllegalArgumentException e) {
            var mensagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, mensagemErro);
        }
    }

    @PutMapping("{id}")
    public void atualizarStatus(@PathVariable("id") Integer id,
                                @RequestBody ToDoEntity toDo) {
        toDo.setId(id);
        service.atualizarStatus(toDo);
    }

    @GetMapping("{id}")
    public ToDoEntity buscar(@PathVariable("id") Integer id) {
        return service.buscarPorId(id);
    }
}
