package com.projetograficos.backend.services;

import com.projetograficos.backend.dto.BarraDTO;
import com.projetograficos.backend.dto.RadarDTO;
import com.projetograficos.backend.models.Resumo;
import com.projetograficos.backend.repositories.ResumoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ResumoService {
    private final ResumoRepository repository;

    public Resumo criar(LocalDate mes, Double ganhos, Double perdas) {
        Resumo novoResumo = new Resumo();
        novoResumo.setData(mes);
        novoResumo.setGanhos(ganhos);
        novoResumo.setPerdas(perdas);
        return repository.save(novoResumo);
    }

    public List<BarraDTO> obterTodas() {
        return repository.findAll().stream()
                .map(barra -> new BarraDTO(barra.getData(), barra.getGanhos(), barra.getPerdas())).toList();
    }

    public List<RadarDTO> obterTodasRadar() {
        return repository.findAll().stream()
                .map(barra -> new RadarDTO(barra.getData(), barra.getGanhos() - barra.getPerdas())).toList();
    }
}
