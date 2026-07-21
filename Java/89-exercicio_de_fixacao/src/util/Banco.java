package util;

public class Banco {

    String nome;
    private int numeroConta;
    private double saldo = 0;

    public Banco() {}

    public Banco(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + 5;
    }

    public String toString() {
        return "Conta "
                + numeroConta
                + ", Titutar: "
                + nome
                + ", Saldo: "
                + String.format("$ %.2f%n", saldo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }

}
