package Modulo_06_exercicios_for;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = 0;
        int f = 0;

        int x = sc.nextInt();
        for(int n = 0; n < x; n++ ) {
            x = sc.nextInt();
            if(x >= 10 && x <= 20) {
                d += 1;

            }
            else {
                f += 1;
            }
        }
        System.out.printf("%d in\n", d);
        System.out.printf("%d out ",f);



    }
}
