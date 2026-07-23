package application;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o velor? ");
        int elementos = sc.nextInt();
        int[] vetor = new int[elementos];
        int soma = 0;
        int contador = 0;

        for (int i=0; i< vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                soma +=vetor[i];
                contador += 1;
            }
        }

        int media = soma / contador;

        if (media > 0) {
            System.out.printf("Media dos pares = %d%n", media);
        }
        else {
            System.out.println("Nenhum numero par");
        }
    }
}
