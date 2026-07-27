package com.cursospring.libaryapi.repository;

import com.cursospring.libaryapi.service.TransacaoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class TransacoesTest {
    @Autowired
    TransacaoService transacaoService;

    /**
     * Commit -> confirma auterações
     * Rollback -> desfaz alterações
     */
    @Test
    @Transactional
    void transacaoSimples() {
        transacaoService.executar();
    }

    @Test
    void transacaoEstadoManaged() {
        transacaoService.executar();
    }
}
