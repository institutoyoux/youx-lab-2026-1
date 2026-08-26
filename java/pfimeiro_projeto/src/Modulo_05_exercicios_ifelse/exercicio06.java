package Modulo_05_exercicios_ifelse;

import java.util.Locale;
import java.util.Scanner;
public class exercicio06 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        if(v >= 0 && v <= 25) {
            System.out.println("Intervalo (0,25) ");
        }
        else if(v >= 25 && v <= 50) {
            System.out.println("Intervalo (25,50)");
        }
        else if(v >= 50 && v <= 75) {
            System.out.println("Intervalo (50,75)");

        }
        else if ( v >= 75 && v <= 100) {
            System.out.println("Intervalo (75,100)");

        }
        else  {
            System.out.println("Fora de Intervalo");
        }
    }
}
