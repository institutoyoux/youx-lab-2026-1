package application;

import entities.Dados;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int quantidade = sc.nextInt();
        Dados[] pessoas = new Dados[quantidade];

        for (int i=0; i< pessoas.length; i++) {
            System.out.printf("Dados a %d pessoa%n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new Dados(nome, idade);
        }

        int maior = 0;
        String pessoa = "";

        for (int i=0; i< pessoas.length; i++) {
            if (i == 0) {
                maior = pessoas[i].getIdade();
                pessoa = pessoas[i].getNome();
            } else if (pessoas[i].getIdade() > maior) {
                maior = pessoas[i].getIdade();
                pessoa = pessoas[i].getNome();
            }
        }

        System.out.println("Pessoa mais velha: " + pessoa);
    }
}
