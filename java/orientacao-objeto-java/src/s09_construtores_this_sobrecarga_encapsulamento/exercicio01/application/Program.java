package s09_construtores_this_sobrecarga_encapsulamento.exercicio01.application;

import s09_construtores_this_sobrecarga_encapsulamento.exercicio01.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("enter account number:");
        int numero = sc.nextInt();
        System.out.println("enter account holder: ");
        String nome = sc.nextLine();
        Conta conta = new Conta(numero, nome);

        System.out.println("is there na initial deposit (y/n)? ");
        String opcao = sc.nextLine();
        double valor = 0;
        if (opcao == "y") {
            System.out.println("enter initial deposit value: ");
            valor = sc.nextDouble();
            conta.deposito(valor);
        }



        System.out.println("account data");
        System.out.println(conta.toString());


        System.out.println("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println("account data ");
        System.out.println(conta.toString());
        System.out.println("enter a withdraw value: ");
        double vl = sc.nextDouble();
        conta.saque(vl);
        System.out.println("update account data: ");
        System.out.println(conta.toString());





























































































































    }
}
