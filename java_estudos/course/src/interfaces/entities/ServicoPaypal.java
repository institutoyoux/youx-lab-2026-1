package interfaces.entities;

public class ServicoPaypal implements ServicoPagamentoOnline {

    @Override
    public double taxaPagamento(double valorParcela) {
        return valorParcela * 0.02;
    }

    @Override
    public double juros(double valorParcela, int meses) {
        return valorParcela * 0.01 * meses;
    }
}
