package application;

import model.entities.Account;
import model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite os dados da conta:");
            System.out.print("Numero: ");
            int numero = sc.nextInt();
            System.out.print("Titular: ");
            sc.nextLine();
            String titular = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            double limiteSaque = sc.nextDouble();

            Account conta = new Account(numero, titular, saldo, limiteSaque);

            System.out.println();
            System.out.print("Quantia para sacar: ");
            double saque = sc.nextDouble();
            conta.withDraw(saque);

            System.out.printf("Saldo atualizado: $ %.2f", conta.getBalace());
        }
        catch (DomainException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }

        sc.close();
    }
}
