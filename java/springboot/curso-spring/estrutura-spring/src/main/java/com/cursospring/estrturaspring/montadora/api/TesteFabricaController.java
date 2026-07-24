package com.cursospring.estrturaspring.montadora.api;

import com.cursospring.estrturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Aspirado
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHrv(motor);
        return carro.darIgnicao(chave);
    }
}
