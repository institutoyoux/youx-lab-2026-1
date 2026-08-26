package Modulo_05_exercicios_ifelse;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("digite um numero");
        num = sc.nextInt();
        if(num < 0) {

            System.out.println("Negativo");
        }

        else {
            System.out.println("nao negativo");
        }

    }
}
