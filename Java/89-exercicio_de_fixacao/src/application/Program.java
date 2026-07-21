package application;

import util.Banco;

import java.util.Scanner;

public class Program {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        char resposta;

        System.out.print("Numero da conta: ");
        int conta = sc.nextInt();
        System.out.print("Titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        Banco banco = new Banco(nome, conta);

        System.out.print("Deseja fazer um deposito inicial? (S/N) ");
        resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.println();
            System.out.print("Valor do deposito inicial: ");
            double valor = sc.nextDouble();
            banco.deposito(valor);

            System.out.println();
            System.out.println("Dados da conta:");
            System.out.println(banco.toString());
        }

        System.out.println();
        System.out.print("Valor do deposito: ");
        double valor = sc.nextDouble();
        banco.deposito(valor);

        System.out.println("Dados da conta atualizados:");
        System.out.println(banco.toString());

        System.out.println();
        System.out.print("Valor do saque: ");
        valor = sc.nextDouble();
        banco.saque(valor);

        System.out.println("Dados da conta atualizados:");
        System.out.println(banco.toString());

    }
}
