package entities;

public class Usuario {
    private String nome;
    private double saldo;
    private double fee;
    public Usuario() {}
    public Usuario(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.fee = 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public void deposit(Double valor) {
        this.saldo += valor;
    }
    public void saque(Double valor) {
        double saque = valor + fee;
        if (saque > saldo) {
            throw new IllegalArgumentException("Erro: saldo insuficiente: " + getSaldo());
        } else {
            saldo -= saque;
        }
    }
}
