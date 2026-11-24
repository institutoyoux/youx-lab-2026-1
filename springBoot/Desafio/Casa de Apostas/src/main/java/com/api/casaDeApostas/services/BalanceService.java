package com.api.casaDeApostas.services;

import com.api.casaDeApostas.entities.User;
import com.api.casaDeApostas.enums.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class BalanceService {
    private final UserService userService;

    @Transactional
    public void deposit(User user, BigDecimal amount) {

        validateUser(user);
        validateAmount(amount);

        user.setBalance(user.getBalance().add(amount));
        userService.save(user);
    }

    @Transactional
    public void withdraw(User user, BigDecimal amount) {

        validateUser(user);
        validateAmount(amount);

        if (user.getBalance().compareTo(amount) < 0) {
            throw new IllegalArgumentException(
                    "Saldo insuficiente"
            );
        }

        user.setBalance(user.getBalance().subtract(amount));
        userService.save(user);
    }

    private void validateUser(User user) {

        if (user.getRole() != UserRole.USER) {
            throw new IllegalArgumentException(
                    "Operação permitida somente para usuários USER"
            );
        }

        if (user.getBalance() == null) {
            throw new IllegalStateException(
                    "Saldo não inicializado"
            );
        }
    }

    private void validateAmount(BigDecimal amount) {

        if (amount == null ||
                amount.compareTo(BigDecimal.ZERO) <= 0) {

            throw new IllegalArgumentException(
                    "Valor inválido"
            );
        }
    }
}
