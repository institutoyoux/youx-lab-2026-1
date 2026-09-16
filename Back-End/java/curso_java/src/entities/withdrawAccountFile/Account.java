package entities.withdrawAccountFile;

import java.util.InputMismatchException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
        this.balance = 0.0;
    }

    public Account(Integer number, String holder, Double initialBalance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = initialBalance;
        this.withdrawLimit = withdrawLimit;

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("New balance: "+balance);
        }
    }
    public void withdraw(Double amount) {
        try {
            if(amount >= 0 && amount <= withdrawLimit && amount <= balance) {
                balance -= amount;
                System.out.println("New balance: "+balance);
            }
            else{
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e) {
            if(amount < 0) {
                System.out.println("ERROR: 'amount' value lower than '0'. ");
            }
            else if(amount > withdrawLimit) {
                System.out.println("ERROR: 'amount' value bigger than 'withdrawLimit' value. ");
            }
            else if (amount > balance) {
                System.out.println("ERROR: 'amount' value bigger than 'balance' value. ");
            }
            else {
                System.out.println("ERROR: 'Unexpected error'.");
            }
        }
    }

    @Override
    public String toString(){
        String resposta = "----------------------\n";
        resposta += "Number: " + this.number + "\n";
        resposta += "Holder: " + this.holder + "\n";
        resposta += "Balance: " + this.balance + "\n";
        resposta += "WithdrawLimit: " + this.withdrawLimit + "\n";
        resposta += "----------------------\n";



        return resposta;
    }
}
