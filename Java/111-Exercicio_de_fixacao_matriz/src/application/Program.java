package application;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Numero de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int linha=0; linha< matriz.length; linha++) {
            for (int coluna=0; coluna<matriz[linha].length; coluna++) {
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        System.out.print("Numero para verificar a posiçao: ");
        int numero = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero == matriz[i][j]) {
                    System.out.printf("Posição %d, %d: %n", i, j);

                    if (j == 0) {
                        System.out.println("Direita: " + matriz[i][j+1]);
                    } else if (j == colunas) {
                        System.out.println("Esqueda: " + matriz[i][j-1]);
                    }
                    else {
                        System.out.println("Esqueda: " + matriz[i][j-1]);
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }

                    if (i == 0) {
                        System.out.println("Abaixo: " + matriz[i+1][j]);
                    } else if (i == linhas) {
                        System.out.println("Acima: " + matriz[i-1][j]);
                    }
                    else {
                        System.out.println("Acima: " + matriz[i-1][j]);
                        System.out.println("Abaixo: " + matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}