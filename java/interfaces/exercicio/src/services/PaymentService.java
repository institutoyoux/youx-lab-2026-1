package services;

public interface PaymentService {
    public Double taxaPagamento(Double valor);
    public Double juros(Double valor, Integer mes);
}
