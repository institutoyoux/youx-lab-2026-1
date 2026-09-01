package vetores;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce ira digitar?");
        int n = sc.nextInt();
        double[] vetor = new double [n];

        for (int i = 0;i< vetor.length;i++) {
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0;i< vetor.length;i++) {
            soma += vetor[i];
        }

        double avg = soma / n;

        System.out.println("VALORES: ");
        for (int i = 0;i<vetor.length;i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("SOMA: "+soma);

        System.out.println("MEDIA "+avg);

        sc.close();
    }
}
