package com.projetouno.novoprojetouno.services;

import com.projetouno.novoprojetouno.models.Baralho;
import com.projetouno.novoprojetouno.models.Carta;
import com.projetouno.novoprojetouno.models.Sala;
import com.projetouno.novoprojetouno.repositories.BaralhoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BaralhoService {
    private final BaralhoRepository repository;
    private final CartasService cartasService;

    public Baralho criarBaralho(Sala sala) {
        Baralho baralho = new Baralho();
        baralho.setSala(sala);
        baralho.setCartas(gerarBaralho());
        return repository.save(baralho);
    }

    public List<Carta> comprar(Baralho baralho, Integer quantidade) {
        List<Carta> cartas = baralho.getCartas();
        int inicio = Math.max(0, cartas.size() - quantidade);
        List<Carta> removidas = new ArrayList<>(cartas.subList(inicio, cartas.size()));
        cartas.subList(inicio, cartas.size()).clear();
        return removidas;
    }


    private List<Carta> gerarBaralho() {
        List<Carta> cartas = cartasService.obterTodas();

        Collections.shuffle(cartas);
        return cartas;
    }
}
