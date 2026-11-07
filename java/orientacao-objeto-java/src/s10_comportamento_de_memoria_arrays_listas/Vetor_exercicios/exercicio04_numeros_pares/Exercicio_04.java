package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio04_numeros_pares;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos numeros voce vai digitar?");
        int num = sc.nextInt();
        int [] vect = new int[num];
        int qnt = 0;
        for (int i=0; i<num; i++) {
            System.out.println("digite um numero:");
            int dig = sc.nextInt();
            vect[i] =dig;
        }
        for (int i=0; i< vect.length; i++) {
            if (vect[i] %2 == 0) {
                System.out.println(vect[i]);
                qnt += 1;

            }

        }
        System.out.println("quantidades de pares " + qnt);






    }
}
