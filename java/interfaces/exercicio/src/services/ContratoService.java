package services;

import entities.Contrato;
import entities.Parcela;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContratoService {
    private PaymentService metodo;

    public ContratoService(PaymentService metodo) {
        this.metodo = metodo;
    }
    public void processContract(Contrato contrato, Integer meses) {
        double valorTotal = contrato.getValorTotal() / meses;
        for (int i=1; i <= meses; i++) {
            LocalDate vencimento = contrato.getData().plusMonths(i);
            double juros = metodo.juros(valorTotal, i);
            double taxa = metodo.taxaPagamento(valorTotal + juros);
            double total = valorTotal + juros + taxa;
            contrato.getParcelas().add(new Parcela(vencimento, total));
        }
    }
}
