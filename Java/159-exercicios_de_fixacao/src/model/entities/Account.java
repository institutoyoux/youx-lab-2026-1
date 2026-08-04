package model.entities;

import model.exception.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balace;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balace, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balace = balace;
        this.withdrawLimit = withdrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public Double getBalace() {
        return balace;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balace += amount;
    }

    public void withDraw(Double amount) throws DomainException {
        if (amount > withdrawLimit) {
            throw new DomainException("O valor do saque ultrapassa o limite de saque");
        }
        if (amount > balace) {
            throw new DomainException("Saldo insuficiente");
        }
        this.balace -= amount;
    }
}
