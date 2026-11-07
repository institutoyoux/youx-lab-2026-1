package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio02_soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos numeros voce vai digitar?");
        int num = sc.nextInt();
        float [] vect  = new float[num];
        float soma = 0;
        for (int i=0; i<num; i++) {
            System.out.println("Digite um numero: ");
            float numero = sc.nextFloat();
            vect[i] = numero;
            soma += numero;
        }
        float media = soma / vect.length;
        for (int i=0; i<num; i++) {
            System.out.println(vect[i] + " ");
        }
        System.out.println(soma);
        System.out.println( media);

    }
}
