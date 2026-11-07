package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio08_media_pares;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] vect = new int[num];
        int media = 0;
        int dv = media / vect.length;
        System.out.println("quantos elementos vai ter o vetor?");
        for(int i=0; i<num; i++) {
            System.out.println("digite um numero: ");
            int dgt = sc.nextInt();
            vect[i] = dgt;
            media += dgt;
        }
        for (int i=0; i< vect.length; i++) {
            if (vect[i] %2==0) {
                System.out.println(vect[i]);
            }
            else {
                System.out.println("Nenhum numero par");
            }

        }
        System.out.println("a media dos pares é:" + dv);
    }


}