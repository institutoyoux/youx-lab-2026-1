package com.projetouno.novoprojetouno.services;

import com.projetouno.novoprojetouno.models.Carta;
import com.projetouno.novoprojetouno.repositories.CartaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartasService {
    private final CartaRepository repository;

    public List<Carta> obterTodas() {
        return repository.findAll();
    }
}
