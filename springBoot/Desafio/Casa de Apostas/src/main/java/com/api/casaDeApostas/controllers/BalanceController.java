
package com.api.casaDeApostas.controllers;

import com.api.casaDeApostas.dtos.DepositDTO;
import com.api.casaDeApostas.dtos.WithdrawDTO;
import com.api.casaDeApostas.entities.User;
import com.api.casaDeApostas.services.BalanceService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
@RequiredArgsConstructor
public class BalanceController {

    private final BalanceService balanceService;

    @PostMapping("/deposit")
    public ResponseEntity<Void> deposit(
            @AuthenticationPrincipal User user,
            @RequestBody @Valid DepositDTO data
    ) {

        balanceService.deposit(user, data.amount());

        return ResponseEntity.noContent().build();
    }

    @PostMapping("/withdraw")
    public ResponseEntity<Void> withdraw(
            @AuthenticationPrincipal User user,
            @RequestBody @Valid WithdrawDTO data
    ) {

        balanceService.withdraw(user, data.amount());

        return ResponseEntity.noContent().build();
    }
}
