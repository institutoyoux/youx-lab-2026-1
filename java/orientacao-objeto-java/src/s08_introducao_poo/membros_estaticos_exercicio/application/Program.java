package s08_introducao_poo.membros_estaticos_exercicio.application;

import s08_introducao_poo.membros_estaticos_exercicio.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        cc.cotacao = sc.nextDouble();
        System.out.println("How many dollars will be bought ? ");
        cc.valor = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", cc.valorReal());

    }

}
