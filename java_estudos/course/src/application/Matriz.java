package application;

import java.util.Scanner;


public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Principal Diagonal");
        for (int i = 0; i < n; i++) {
            System.out.println(mat[i][i]);
        }

        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("quantidade de numeros negativos: "+cont);

    }

}
