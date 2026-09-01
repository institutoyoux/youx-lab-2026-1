package application;

import java.util.Scanner;
import entities.Banco;

public class exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco;

        System.out.println("Digite o numero da conta");
        int numConta = sc.nextInt();
        System.out.println("Digite o nome do usuario");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Tem um deposito a realizar? [s/n]");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.println("Entre com o valor inicial:");
            double valorInicial = sc.nextDouble();
            banco = new Banco(numConta,nome,valorInicial);
        }
        else {
            banco = new Banco(numConta,nome);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(banco);

        System.out.println();
        System.out.println("Entre com um valor pra depositar:");
        double valor = sc.nextDouble();
        banco.deposito(valor);
        System.out.println("Deseja sacar? [s/n]");
        char resposta1 = sc.next().charAt(0);
        if (resposta1 == 's') {
            System.out.println("Digite o valor:");
            valor = sc.nextDouble();
            banco.saque(valor);
        }
        System.out.println("Dados atualizados da conta:");
        System.out.println(banco);

        

    }
}

