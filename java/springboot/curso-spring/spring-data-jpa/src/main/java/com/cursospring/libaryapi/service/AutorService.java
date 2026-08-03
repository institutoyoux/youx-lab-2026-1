package com.cursospring.libaryapi.service;

import com.cursospring.libaryapi.exceptions.OperacaoNaoPermitidaException;
import com.cursospring.libaryapi.model.Autor;
import com.cursospring.libaryapi.model.Usuario;
import com.cursospring.libaryapi.repository.AutorRepository;
import com.cursospring.libaryapi.repository.LivroRepository;
import com.cursospring.libaryapi.security.SecurityService;
import com.cursospring.libaryapi.validator.AutorValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AutorService {
    private final AutorRepository repository;
    private final AutorValidator autorValidator;
    private final LivroRepository livroRepository;
    private final SecurityService securityService;

    public Autor salvar(Autor autor) {
        autorValidator.validar(autor);
        Usuario usuario = securityService.obterUsuarioLogado();
        autor.setUsuario(usuario);
        return repository.save(autor);
    }

    public void atualizar(Autor autor) {
        if(autor.getId() == null) {
            throw new IllegalArgumentException("Para atualizar o autor é necessario que ele já esteja cadastrado!");
        }
        autorValidator.validar(autor);
        repository.save(autor);
    }

    public Optional<Autor> obterPorId(UUID id) {
        return repository.findById(id);
    }

    public void deletar(Autor autor) {
        if (possuiLivro(autor)) {
            throw new OperacaoNaoPermitidaException("Não é permitido deletar autor que possui livros cadastrados!");
        }
        repository.delete(autor);
    }

    public List<Autor> pesquisa(String nome, String nacionalidade) {
        if (nome != null && nacionalidade != null) {
            return repository.findByNomeAndNacionalidade(nome, nacionalidade);
        }
        if (nome != null) {
            return repository.findByNome(nome);
        }
        if (nacionalidade != null) {
            return repository.findByNacionalidade(nacionalidade);
        }
        return repository.findAll();
    }
    public List<Autor> pesquisaByExample(String nome, String nacionalidade) {
        var autor = new Autor();
        autor.setNome(nome);
        autor.setNacionalidade(nacionalidade);

        ExampleMatcher matcher = ExampleMatcher.matching().withIgnorePaths("id", "dataNascimento", "dataCadastro").withIgnoreNullValues().withIgnoreCase().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Autor> autorExample = Example.of(autor,matcher);
        return repository.findAll(autorExample);
    }
    public boolean possuiLivro(Autor autor) {
        return livroRepository.existsByAutor(autor);
    }
}
