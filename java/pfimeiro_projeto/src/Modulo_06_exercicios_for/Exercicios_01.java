package Modulo_06_exercicios_for;

import java.util.Scanner;

public class Exercicios_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int x = 0; x<=num; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }
}


