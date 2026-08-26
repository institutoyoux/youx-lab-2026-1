package Modulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Float a = sc.nextFloat();
        Float b = sc.nextFloat();
        Float c = sc.nextFloat();
        float atg = (a * c) / 2;
        System.out.println("triangulo: " + atg);
        System.out.println("circulo: " + (c * c) * 3.14159);
        System.out.println("trapezio: " + (a + b) * c / 2);
        System.out.println("quadrado: " + b * b );
        System.out.println("retangulo:" + a * b);

    }
}
