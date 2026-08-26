package Modulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        double hora = sc.nextDouble();
        double valor = sc.nextDouble();
        double total = valor * hora;
        System.out.printf("numero = %d\nsalario = R$ %.2f", numero, total);
    }
}
