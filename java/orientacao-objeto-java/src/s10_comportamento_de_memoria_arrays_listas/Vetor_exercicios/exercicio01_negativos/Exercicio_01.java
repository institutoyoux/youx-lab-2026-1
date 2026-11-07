package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio01_negativos;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vect = new int [10];
        System.out.println("Quantos numeros voce vai digitar?");
        int qnt = sc.nextInt();
        for (int i=0; i<qnt; i++) {
            System.out.println("digite um numero:");
           int num = sc.nextInt();
           vect[i]=num;
        }
        for (int i=0; i< vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
    }

}
