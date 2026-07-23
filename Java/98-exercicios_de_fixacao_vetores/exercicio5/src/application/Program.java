package application;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade = sc.nextInt();
        double[] numeros = new double[quantidade];

        double maior = 0;
        int posicao = 0;

        for (int i=0; i< numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
            if (i == 0) {
                maior = numeros[i];
                posicao = i;
            }
            else {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                    posicao = i;
                }
            }
        }

        System.out.println();
        System.out.printf("Maior valor = %.1f%n", maior);
        System.out.println("Posição do maior numero = " + 3);
    }
}
