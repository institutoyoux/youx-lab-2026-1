package Modulo_06_exercicios_for;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        double g = 0;

        int n = sc.nextInt();
        for (int v = 0; v <= n; v++) {
             num = sc.nextInt();
             g = sc.nextInt();
             if(g == 0)   {
                 System.out.println("divisao impossivel");

            }
             else {
                 double total = num / g;
                 System.out.println(total);
             }

        }


    }
}
