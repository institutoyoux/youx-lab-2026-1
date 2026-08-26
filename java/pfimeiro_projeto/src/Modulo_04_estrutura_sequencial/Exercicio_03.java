package Modulo_04_estrutura_sequencial;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        System.out.println("DIFERENCA=" + (A * B - C * D));
    }
}
