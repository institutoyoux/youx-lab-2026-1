package vetores;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros serao digitados? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0;i< numeros.length;i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        int pares = 0;
        int qntdPares = 0;
        System.out.println("Numeros Pares: ");

        for (int i = 0; i< numeros.length;i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
                qntdPares++;
            }
        }
        System.out.println("Quantidade de pares: ");
        System.out.println(qntdPares);
    }



}
