import models.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.print("Holder: ");
        String holder = input.next();
        System.out.print("Initial balance: ");
        Double balance = input.nextDouble();
        System.out.print("Withdraw limit: ");
        Double limit = input.nextDouble();
        Account conta = new Account(number, holder, balance, limit);
        try {
            System.out.print("Enter amount for withdraw: ");
            Double saque = input.nextDouble();
            conta.withdraw(saque);
            System.out.println("New balance: " + conta.getBalance());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}