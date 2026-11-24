package com.api.casaDeApostas.dtos;

public record UserDashboardDTO(
//        - Dashboard com número de jogos feitos, quantos ganhou e quantos perdeu
        Integer jogosFeitos,
        Integer wins,
        Integer loses
) {
}
