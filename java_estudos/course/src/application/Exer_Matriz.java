package application;

import java.util.Scanner;

public class Exer_Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas:");
        int l = sc.nextInt();
        System.out.println("Digite a quantidade de colunas:");
        int c = sc.nextInt();

        System.out.println("Digite os numeros:");
        int[][] mat = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int h = 0; h < c; h++) {
                mat[i][h] = sc.nextInt();
            }
        }

        System.out.println("Numeros:");
        for (int i = 0; i < l; i++) {
            for (int h = 0; h < c; h++) {
                System.out.println(mat[i][h]);
            }
        }

        System.out.println("Digite o numero para ver dado especifico");
        int x = sc.nextInt();

        for (int i = 0; i < l; i++) {
            for (int h = 0; h < c; h++) {
                if (mat[i][h] == x) {
                    System.out.println("Posicao " + i + "," + h + ":");

                    if (h > 0) {
                        System.out.println("Esquerda: " + mat[i][h-1]);
                    }

                    if (i > 0) {
                        System.out.println("Acima: " + mat[i-1][h]);
                    }

                    if (h < c -1) {
                        System.out.println("Direta: " +mat[i][h+1]);
                    }


                    if (i < mat.length - 1) {
                        System.out.println("Abaixo: " + mat[i+1][h]);
                    }




                }

                }
            }

    }
}
