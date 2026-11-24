package com.api.casaDeApostas.entities;

import com.api.casaDeApostas.enums.ResultadoJogo;
import com.api.casaDeApostas.enums.StatusJogo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "jogos")
@Getter
@Setter
@NoArgsConstructor
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ElementCollection
    @CollectionTable(
            name = "jogo_posicoes",
            joinColumns = @JoinColumn(name = "jogo_id")
    )
    @OrderBy("numero ASC")
    private List<PosicaoJogo> posicoes = new ArrayList<>();

    @Column(nullable = false)
    private Integer quantidadeDeBombas;

    @Enumerated(EnumType.STRING)
    private StatusJogo status;

    @Enumerated(EnumType.STRING)
    private ResultadoJogo resultado;

    private BigDecimal valorAposta;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataFinalizacao;

    private Integer diamantesEncontrados;

    @PrePersist
    public void prePersist() {
        this.dataCriacao = LocalDateTime.now();

        if (this.status == null) {
            this.status = StatusJogo.EM_ANDAMENTO;
        }
    }
}
