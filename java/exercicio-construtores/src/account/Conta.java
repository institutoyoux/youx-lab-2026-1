package account;

public class Conta {
    private int number;
    private String holder;
    private double balance;
    public Conta(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    public Conta(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0;
    }

    public int getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return this.balance;
    }

    public void info() {
        System.out.format("Account %d, Holder: %s, Balance: %s\n", this.getNumber(), this.getHolder(), this.getBalance());
    }

    public void deposit(double valor) {
        this.balance += valor;
    }
    public void saque(double valor) {
        this.balance -= (valor + 5);
    }
}
