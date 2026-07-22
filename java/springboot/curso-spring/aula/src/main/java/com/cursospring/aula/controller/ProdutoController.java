package com.cursospring.aula.controller;

import com.cursospring.aula.model.Produto;
import com.cursospring.aula.repository.ProdutoRepositoy;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepositoy produtoRepositoy;

    public ProdutoController(ProdutoRepositoy produtoRepositoy) {
        this.produtoRepositoy = produtoRepositoy;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
        produto.setId(UUID.randomUUID().toString());
        produtoRepositoy.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable String id) {
//        Optional<Produto> produto = produtoRepositoy.findById(id);
//        return produto.isPresent() ? produto.get() : null;
        return produtoRepositoy.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        produtoRepositoy.deleteById(id);
    }
}
