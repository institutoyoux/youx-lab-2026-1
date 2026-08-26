package Modulo_05_exercicios_ifelse;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num;
       num = sc.nextInt();
       if (num % 2 == 0 ) {
           System.out.println("PAR");
       }
       else {
           System.out.println("IMPAR");
       }
    }
}
