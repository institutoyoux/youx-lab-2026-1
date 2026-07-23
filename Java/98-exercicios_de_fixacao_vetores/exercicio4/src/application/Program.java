package application;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidade = sc.nextInt();
        int[] numeros = new int[quantidade];

        int pares = 0;

        for (int i=0; i< numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Numeros pares:");
        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares += 1;
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println();
        System.out.printf("%nQuantidade de pares = %d", pares);
    }
}
