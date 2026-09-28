package io.github.cursodsousa.arquiteturaspring;

import io.github.cursodsousa.arquiteturaspring.toDos.*;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("user");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        ToDoRepository repository = null; //new SimpleJpaRepository<ToDoEntity, Integer>();
        ToDoValidator toDoValidator = new ToDoValidator(repository);
        MailSender sender = new MailSender();

        ToDoService toDoService = new ToDoService(repository, toDoValidator, sender);
    }
}
