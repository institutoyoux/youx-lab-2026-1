package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dolar, compra;

        System.out.print("Qual e o preço do dolar? ");
        dolar = sc.nextDouble();

        System.out.print("Quantos dolares vai comprar? ");
        compra = sc.nextDouble();

        System.out.printf("Valor a ser pago em real = %.2f%n", CurrencyConverter.corversor(dolar, compra));

        sc.close();
    }

}
