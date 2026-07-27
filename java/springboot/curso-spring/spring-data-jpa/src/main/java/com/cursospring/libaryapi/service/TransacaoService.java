package com.cursospring.libaryapi.service;

import com.cursospring.libaryapi.model.Autor;
import com.cursospring.libaryapi.model.GeneroLivro;
import com.cursospring.libaryapi.model.Livro;
import com.cursospring.libaryapi.repository.AutorRepository;
import com.cursospring.libaryapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class TransacaoService {

    @Autowired
    private AutorRepository autorRepository;
    @Autowired
    private LivroRepository livroRepository;

    @Transactional
    // livro (titulo,... nome_arquivo) -> id.png
    public void salvarLivroComFoto() {
        //salva o livro
        //repository.save(livro);
        //var id = livro.getId();


        //salva foto do livro -> bucket na nuvem
        // bucketService.salvar(livro.getFoto(), id+ ".png");

        //atualizar nome que foi salvo
        //livro.setNome(id + ".png");
        //repository.save(livro);
    }

    @Transactional
    public void atualizarSemAtualzar() {
        var livro = livroRepository.findById(UUID.fromString("14e281ae-455d-41bb-ac68-a4f4929f24e1")).orElse(null);
        livro.setDataPublicacao(LocalDate.of(2024, 6, 1));
        // não precisa de: livroRepository.save(livro); pois a anotação do jpa já salva
    }

    @Transactional
    public void executar() {
        //salva o autor
        Autor autor = new Autor();
        autor.setNome("Francisco");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of( 1951, 1, 31));

        autorRepository.save(autor);

        // salva o livro
        Livro livro = new Livro();
        livro.setIsbn("90887-84874");
        livro.setPreco(BigDecimal.valueOf(100));
        livro.setGenero(GeneroLivro.FICCAO);
        livro.setTitulo("Livro do francisco");
        livro.setDataPublicacao(LocalDate.of(1980, 1, 2));
        livro.setAutor(autor);
        livroRepository.save(livro);
        if (autor.getNome().equals("Francisco")) {
            throw new RuntimeException("Rollback!");
        }
    }
}
