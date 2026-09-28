package interfaces.entities;

public interface ServicoPagamentoOnline {
    double taxaPagamento(double valorParcela);
    double juros(double valorParcela,int meses);
}
