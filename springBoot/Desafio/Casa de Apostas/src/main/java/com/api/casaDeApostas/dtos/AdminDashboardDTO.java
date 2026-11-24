package com.api.casaDeApostas.dtos;

import java.math.BigDecimal;

public record AdminDashboardDTO(
//      - Dashboard com número de jogos feitos e valor ganho nos jogos
        BigDecimal ganhos,
        Integer jogos
) {

}
