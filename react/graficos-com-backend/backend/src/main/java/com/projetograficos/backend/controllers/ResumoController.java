package com.projetograficos.backend.controllers;

import com.projetograficos.backend.dto.BarraDTO;
import com.projetograficos.backend.dto.RadarDTO;
import com.projetograficos.backend.models.Resumo;
import com.projetograficos.backend.services.ResumoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("resumo")
@RequiredArgsConstructor
@CrossOrigin
public class ResumoController {
    private final ResumoService resumoService;

    @PostMapping
    public ResponseEntity<Void> criar() {
        for (int i=0; i < 12; i++) {
            Random random = new Random();
            Double ganhos = random.nextDouble(100, 3000);
            Double perdas = random.nextDouble(100, 3000);
            resumoService.criar(LocalDate.of(2026, i+1, 1), ganhos, perdas);
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/barras")
    public ResponseEntity<List<BarraDTO>> obterTodasBarras() {
        return ResponseEntity.ok().body(resumoService.obterTodas());
    }
    @GetMapping("/radar")
    public ResponseEntity<List<RadarDTO>> obterTodasRadar() {
        return ResponseEntity.ok().body(resumoService.obterTodasRadar());
    }
}