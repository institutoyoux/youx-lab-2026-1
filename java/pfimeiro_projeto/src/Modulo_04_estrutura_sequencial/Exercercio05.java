package Modulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercercio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int n1 = sc.nextInt();
        double v1 = sc.nextDouble();
        int c2 = sc.nextInt();
        int n2 = sc.nextInt();
        double v2 = sc.nextDouble();
        double total = n1 * v1 + n2 * v2;
        System.out.printf("Valor a pagar: R$ %.2f", total);

    }
}
