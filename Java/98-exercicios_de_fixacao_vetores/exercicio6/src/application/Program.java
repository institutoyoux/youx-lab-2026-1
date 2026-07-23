package application;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter em cada vetor? ");
        int quantidade = sc.nextInt();
        int[] vetorA = new int[quantidade];
        int[] vetorB = new int[quantidade];
        int[] vetorC = new int[quantidade];

        System.out.println("Digite os valores do vetor A:");
        for (int i=0; i< vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i=0; i< vetorA.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante:");
        for (int i=0; i< vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }
    }
}