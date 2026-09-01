package entities;

public class Banco {
    private int numConta;
    private String nome;
    private double valor;


    public Banco(int numConta, String nome,double valorInicial) {
        this.numConta = numConta;
        this.nome = nome;
        deposito(valorInicial);
    }

    public Banco(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void deposito(double amount) {
        valor += amount;
    }

    public void saque(double amount) {
        valor -= amount + 5.0;
    }

    public String toString() {
        return "Conta: "+ numConta + ", Cliente: " + nome + ", Valor: $" + String.format("%.2f",valor);
    }
}
