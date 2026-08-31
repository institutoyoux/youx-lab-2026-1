package s08_introducao_poo.exercicio01.program;

import s08_introducao_poo.exercicio01.entities.Retangulo;

import java.util.Scanner;

public class Program {
    public static void main (String[] args)  {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height");
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();
        retangulo.altura = altura;
        retangulo.largura = largura;

        System.out.println("Area = " + retangulo.valorArea());
        System.out.println("Perimetro = " + retangulo.perimetroRetangulo());
        System.out.println("Diagonal = " + retangulo.diagonalRetangulo());
    }
}
