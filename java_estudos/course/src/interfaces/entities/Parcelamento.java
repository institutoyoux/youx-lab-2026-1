package interfaces.entities;

import java.time.LocalDate;

public class parcelamento {
    private LocalDate data;
    private Double valorParcela;

    public parcelamento(LocalDate data, Double valorParcela) {
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
}


