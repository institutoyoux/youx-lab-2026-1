package services;

public class PaypalService implements PaymentService {
    @Override
    public Double taxaPagamento(Double valor) {
        return valor * 0.02;
    }
    @Override
    public Double juros(Double valor, Integer mes) {
        return valor * 0.01 * mes;
    }
}
