import account.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int number = input.nextInt();
        System.out.print("Enter account holder: ");
        String holder = input.next();
        System.out.print("Is there na initial deposit (y/n)?: ");
        Double initial = 0.0;
        if (input.next().toUpperCase().equals("Y")) {
            System.out.print("Enter initial deposit value: ");
            initial = input.nextDouble();
        }
        Conta conta = new Conta(number, holder, initial);
        System.out.println("Account data:");
        conta.info();
        System.out.print("Enter a deposit value: ");
        conta.deposit(input.nextDouble());
        System.out.println("Updated account data: ");
        conta.info();
        System.out.print("Enter a withdraw value: ");
        conta.saque(input.nextDouble());
        conta.info();
    }
}