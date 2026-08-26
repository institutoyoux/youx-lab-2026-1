package Modulo_06_exercicios_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double v = 0;
        double r = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            v = sc.nextDouble();
            if (i == 0 ) {
                r += v * 2;
                soma += 2;
            }
            else if (i == 1) {
                r += v * 3;
                soma += 3;
            }
            else {
                r += v * 5;
                soma += 5;
            }

        }
        System.out.printf("%.1f", r/soma);

    }
}
