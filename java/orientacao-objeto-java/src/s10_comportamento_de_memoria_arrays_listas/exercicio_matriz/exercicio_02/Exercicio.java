package s10_comportamento_de_memoria_arrays_listas.exercicio_matriz.exercicio_02;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int a = 0; a < n; a++) {
                int num = sc.nextInt();
                mat[i][a] = num;

            }

        }
        int posicao = sc.nextInt();
        for (int i=0; i<m; i++) {
            for (int linda=0; linda<n; linda++) {
                if (mat[i][linda] == posicao) {
                    System.out.println("Position " + i + linda);
                    if (linda  == 0) {
                        System.out.println("right: " + mat[i][linda +1] );

                    }
                    else if (linda == n -1) {
                        System.out.println(" left " + mat[i][linda -1] );

                    }
                    else {
                        System.out.println(" left " + mat[i][linda -1] );
                        System.out.println("right: " + mat[i][linda +1] );


                    }
                    if (i == 0) {
                        System.out.println("Down: " + mat[i +1] [linda]);

                    }
                    else if (i == m -1) {
                        System.out.println("up: " + mat[i -1] [linda]);

                    }
                    else {
                        System.out.println("Down: " + mat[i +1] [linda]);
                        System.out.println("up: " + mat[i -1] [linda]);

                    }

                }

            }
        }


    }
}