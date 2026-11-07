package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio07_abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int num = sc.nextInt();
        double [] vect = new double[num];
        double media =0;

        System.out.println("Quantos elementos vai ter o vetor");

        for (int i=0;i<num;i++) {
            System.out.println("digite um numero: ");
            double dgt = sc.nextDouble();
            vect[i] = dgt;
            media = num += dgt/media;

        }
        System.out.println("media do vetor = " + media);




    }
}
