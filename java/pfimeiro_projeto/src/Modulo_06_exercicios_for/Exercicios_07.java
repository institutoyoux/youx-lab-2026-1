package Modulo_06_exercicios_for;

import java.util.Scanner;

public class Exercicios_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for(int i = 1; i <= numero; i++) {
            System.out.println(i + " " + i * i  + " " +  (i * i) * i);
        }
    }
}
