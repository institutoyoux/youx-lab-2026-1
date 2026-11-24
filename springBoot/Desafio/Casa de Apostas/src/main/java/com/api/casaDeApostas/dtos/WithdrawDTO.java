package com.api.casaDeApostas.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record WithdrawDTO(

        @NotNull
        @DecimalMin(value = "0.01")
        BigDecimal amount

) {}
