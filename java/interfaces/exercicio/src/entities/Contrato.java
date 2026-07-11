package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private int number;
    private LocalDate data;
    private Double valorTotal;
    private List<Parcela> parcelas = new ArrayList<>();

    public Contrato() {}
    public Contrato(int number, LocalDate data, Double valorTotal) {
        this.number = number;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public List<Parcela> getParcelas() {
        return parcelas;
    }
}
