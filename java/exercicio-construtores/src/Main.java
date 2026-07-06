import account.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1002, "Alex");
        c1.deposit(50);
        c1.saque(1);
        System.out.println(c1.getBalance());
        String holder = input("Nome da conta: ");
        if (input("Deseja fazer um deposito?: ").toUpperCase().contains("S")) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o valor: ");
            double valor = scan.nextInt();
            Conta c2 = new Conta(1001, holder, valor);
            System.out.println("Conta criada com sucesso! saldo: " + c2.getBalance());
            c2.deposit(50);
            System.out.println("Deposito feito com sucesso! saldo: " + c2.getBalance());
            c2.saque(50);
            System.out.println("Saque realizado com sucesso! saldo: " + c2.getBalance());
        } else {
            Conta c2 = new Conta(1001, holder);
            System.out.println("Conta criada com sucesso! saldo: " + c2.getBalance());
            c2.deposit(50);
            System.out.println("Deposito feito com sucesso! saldo: " + c2.getBalance());
            c2.saque(50);
            System.out.println("Saque realizado com sucesso! saldo: " + c2.getBalance());
        }

    }
    public static String input(String text) {
        System.out.print(text);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}