package interfaces.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate data;
    private Double valorParcela;

    public Parcelamento(LocalDate data, Double valorParcela) {
        this.data = data;
        this.valorParcela = valorParcela;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public String toString() {
        return data + " - " + valorParcela;
    }
}


