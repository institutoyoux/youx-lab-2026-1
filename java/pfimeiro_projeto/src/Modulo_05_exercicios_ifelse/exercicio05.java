package Modulo_05_exercicios_ifelse;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int cd = sc.nextInt();
        int qt = sc.nextInt();
        double preco;
        if (cd == 1) {
            preco = 4 * qt;

        } else if (cd == 2) {
            preco = 4.50 * qt;
        } else if (cd == 3) {
            preco = 5 * qt;
        }
        else if (cd == 4) {
            preco = 2 * qt;

        }
        else {
            preco = 1.50 * qt;
        }
        System.out.printf("total: R$ %.2f", preco);
    }
}
