package entities;

import java.time.LocalDate;

public class Parcela {
    private LocalDate data;
    private Double valor;
    public Parcela(LocalDate data, Double valor) {
        this.data = data;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return data + " - " + valor;
    }
}
