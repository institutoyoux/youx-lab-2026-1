package Modulo_05_exercicios_ifelse;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        if (a % b == 0) {
            System.out.println("sao multiplos");
        }
        else {
            System.out.println("nao sao multiplos");

        }


    }
}
