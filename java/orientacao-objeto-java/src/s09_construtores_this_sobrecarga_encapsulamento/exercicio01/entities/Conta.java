package s09_construtores_this_sobrecarga_encapsulamento.exercicio01.entities;

public class Conta {
    private double numero_conta;
    private String nome;
    private double valor_deposito;

    public Conta(double numero_conta, String nome) {
        this.numero_conta = numero_conta;
        this.nome = nome;
    }

    public Conta(double numero_conta, String nome, double  valor_deposito) {
        this.numero_conta = numero_conta;
        this.nome = nome;
        this.valor_deposito = valor_deposito;
    }
    public Conta() {

    }
    public void deposito (double deposito) {
        valor_deposito += deposito;


    }

    public  void saque(double saque) {
        valor_deposito -= saque + 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor_deposito() {
        return valor_deposito;
    }

    public double getNumero_conta() {
        return numero_conta;
    }

    public String toString () {
        return "account " + numero_conta + ", holder: " + nome + ", balance " + String.format("%.2f", valor_deposito);
    }


}

