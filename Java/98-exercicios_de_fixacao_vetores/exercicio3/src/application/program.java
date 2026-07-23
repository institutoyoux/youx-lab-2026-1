package application;

import entities.Dados;

import java.util.Scanner;

public class program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidade = sc.nextInt();

        Dados[] dados = new Dados[quantidade];

        for (int i=0; i<dados.length; i++) {
            System.out.printf("Dados da %d pessoa:%n", i+1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            dados[i] = new Dados(nome, idade, altura);
        }

        double soma = 0;

        for (int i=0; i< dados.length; i++) {
            soma += dados[i].getAltura();
        }
        double media = soma / dados.length;


        double menores16 = 0;

        for (int i=0; i<dados.length; i++) {
            if (dados[i].getIdade() < 16) {
                menores16 +=1;
            }
        }
        double porcentagem = menores16 / dados.length * 100;


        System.out.printf("Altura media: %.2f%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", porcentagem);

        for (int i=0; i<dados.length; i++) {
            if (dados[i].getIdade() < 16) {
                System.out.println(dados[i].getNome());
            }
        }

        sc.close();
    }
}