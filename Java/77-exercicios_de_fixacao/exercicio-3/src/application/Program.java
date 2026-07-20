package application;

import entities.Estudante;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);
        Estudante aluno;

        aluno = new Estudante();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Primerio trimestre: ");
        aluno.trimestre1 = sc.nextDouble();
        System.out.print("Segundo trimestre: ");
        aluno.trimestre2 = sc.nextDouble();
        System.out.print("Terceiro trimestre: ");
        aluno.trimestre3 = sc.nextDouble();

        System.out.printf("Nota Final = %.2f%n", aluno.notaFinal());
        if (aluno.notaFinal() >= 60) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
            double faltam = 60 - aluno.notaFinal();
            System.out.printf("Faltam %.2f pontos%n", faltam);

        }

        sc.close();
    }
}
