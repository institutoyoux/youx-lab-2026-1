package Modulo_05_exercicios_ifelse;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double im;
        if (v >= 0 && v <= 2000) {
            System.out.println("Isento");
        }
        else if (v >= 2000.01 && v <= 3000) {
            im = v * 8/100;
            System.out.printf("R$ %.2f", im);

        }
        else if ( v >= 3000.01 && v <= 4500) {
            im = v * 18/100;
            System.out.printf("R$ %.2f", im);
        }
        else {
            im = v * 28/100;
            System.out.printf("R$ %.2f", im);
        }
    }
}
