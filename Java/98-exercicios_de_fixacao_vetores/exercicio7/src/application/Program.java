package application;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int elementos = sc.nextInt();
        double[] vetor = new double[elementos];
        double soma = 0;

        for (int i=0; i<vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        System.out.printf("Media do vetor = %.3f%n", media);
        System.out.println("Elementos abaixo da media:");
        for (int i=0; i< vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
