package Modulo_06_exercicios_for;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int fat = 1;
        for (int i = 0; i >= n; i++) {
            fat = fat * i;
        }
        System.out.println(fat);
    }
}
