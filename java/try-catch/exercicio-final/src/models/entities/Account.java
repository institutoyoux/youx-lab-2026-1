package models.entities;

public class Account {
    private int number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }
    public Account(int number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double valor) {
        balance += valor;
    }
    public void withdraw(Double valor) throws IllegalArgumentException {
        if (valor > withdrawLimit) {
            throw new IllegalArgumentException("Erro: valor de saque ultrapassa o limite de saque");
        } else if (valor > balance) {
            throw new IllegalArgumentException("Erro: o valor de saque é maior que o saldo disponivel!");
        } else {
            balance -= valor;
        }
    }

}
