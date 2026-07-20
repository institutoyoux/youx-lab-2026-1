package application;

import entities.Retangulo;

import java.util.Scanner;

public class Program {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        Retangulo x;
        x = new Retangulo();

        System.out.println("Digite a altura e a largura de um retangulo:");
        x.altura = sc.nextDouble();
        x.largura = sc.nextDouble();

        System.out.printf("Area = %.2f%n", x.area());
        System.out.printf("Perimetro = %.2f%n", x.perimetro());
        System.out.printf("Diagonal = %.2f%n", x.diagonal());
    }
}
