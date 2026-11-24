package com.api.casaDeApostas.entities;

import com.api.casaDeApostas.enums.TipoPosicao;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class PosicaoJogo {

    @Column(name = "numero_posicao")
    private Integer numero;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_posicao")
    private TipoPosicao tipo;

    @Column(name = "revelada")
    private boolean revelada;
}
