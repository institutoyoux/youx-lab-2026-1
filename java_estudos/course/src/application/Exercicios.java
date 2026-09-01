package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Exercicio 1");
        Retangulo rect = new Retangulo();
        System.out.println("Digite a altura e largura do retangulo: ");
        rect.altura = sc.nextDouble();
        rect.largura = sc.nextDouble();
        System.out.println();
        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETRO = %.2f%n",rect.perimeter());
        System.out.printf("DIAMETRO = %.2f%n",rect.diagonal());
        sc.close();
    }
}
