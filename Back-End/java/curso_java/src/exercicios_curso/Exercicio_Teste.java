package exercicios_curso;

import java.util.Locale;

public class Exercicio_Teste {

    public static void main(String[] args){

        // Variáveis

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // Saída na tela

        System.out.println("Products:");
        System.out.print("%s, which price is $%.1f%n".formatted(product1, price1));
        System.out.print("%s, which price is $%.2f%n".formatted(product2,price2));
        System.out.println();
        System.out.print("Record: %d years old, code %d and gender: %s%n".formatted(age, code, gender));
        System.out.println();
        System.out.print("Measue: %.8f%n".formatted(measure));
        System.out.print("Rouded: %.3f%n".formatted(measure));
        Locale.setDefault(Locale.US);
        System.out.print("US decimal point: %.3f%n".formatted(measure));
    }
}