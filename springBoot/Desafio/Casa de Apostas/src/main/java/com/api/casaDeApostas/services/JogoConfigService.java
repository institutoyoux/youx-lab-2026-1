
package com.api.casaDeApostas.services;

import com.api.casaDeApostas.configs.JogoConfig;
import com.api.casaDeApostas.repositories.JogoConfigRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class JogoConfigService {

    private final JogoConfigRepository repository;

    @Transactional
    public JogoConfig configurar(Integer quantidadeDeBombas) {

        if (!(quantidadeDeBombas != null &&
                (quantidadeDeBombas >= 1) &&
                (quantidadeDeBombas <= 24))) {

            throw new IllegalArgumentException(
                    "A quantidade de bombas deve estar entre 1 e 24"
            );
        }

        JogoConfig config = repository.findAll()
                .stream()
                .findFirst()
                .orElse(new JogoConfig());

        config.setQuantidadeDeBombas(quantidadeDeBombas);

        return repository.save(config);
    }

    public JogoConfig buscarConfiguracao() {

        return repository.findAll()
                .stream()
                .findFirst()
                .orElseThrow(() ->
                        new IllegalStateException(
                                "O jogo ainda não foi configurado"
                        )
                );
    }
}
