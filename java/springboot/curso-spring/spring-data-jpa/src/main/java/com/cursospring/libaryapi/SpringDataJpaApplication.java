package com.cursospring.libaryapi;

import com.cursospring.libaryapi.model.Autor;
import com.cursospring.libaryapi.repository.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringDataJpaApplication.class, args);
        AutorRepository repository = context.getBean(AutorRepository.class);
        exemploSalvarRegistro(repository);
    }
    public static void exemploSalvarRegistro(AutorRepository autorRepository) {
        Autor autor = new Autor();
        autor.setNome("José");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of( 1950, 1, 31));
        var autorSalvo = autorRepository.save(autor);
        System.out.println("Autor salvo: " + autorSalvo);
    }
}
