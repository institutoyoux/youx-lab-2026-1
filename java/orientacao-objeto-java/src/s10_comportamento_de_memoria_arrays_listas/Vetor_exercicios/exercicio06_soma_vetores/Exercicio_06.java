package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio06_soma_vetores;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos valores vai ter cada vetor?");
        int rstd = 0;
        int num = sc.nextInt();
        int [] vectA = new int [num];
        int [] vectB = new int [num];
        for (int i=0; i< vectA.length; i++) {
            System.out.println("digite os valores do valor A: ");
            int vlrA = sc.nextInt();
            vectA[i] = vlrA;
         }


            for (int i=0; i< vectA.length; i++) {
                System.out.println("digite os valores  do valor B: ");
               int vlrB = sc.nextInt();
               vectB[i] =vlrB;
               rstd = vectA[i] += vectB[i];



        }
        System.out.println("Vetor Resultante " + rstd);




    }

}
