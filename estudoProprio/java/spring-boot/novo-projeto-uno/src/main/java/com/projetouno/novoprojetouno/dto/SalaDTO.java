package com.projetouno.novoprojetouno.dto;

import com.projetouno.novoprojetouno.models.Carta;

public record SalaDTO(
        Carta carta_atual,
        BaralhoDTO baralho,
        UsuarioDTO jogador1,
        UsuarioDTO jogador2,
        Integer codigo,
        Boolean vez_jogador1
) {

}
