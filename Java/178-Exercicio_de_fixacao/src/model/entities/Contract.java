package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private  Integer number;
    private LocalDate date;
    private Double totalValue;

    private List<Installment> installmentList = new ArrayList<>();

    public Contract() {}

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void addInstallment(Installment installment) {
        installmentList.add(installment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Installment i: installmentList) {
            sb.append(fmt.format(i.getDueDate()) + " - " + String.format("%.2f", i.getAmount()) + "\n");
        }
        return sb.toString();
    }
}
