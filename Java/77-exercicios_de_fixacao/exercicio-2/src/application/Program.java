package application;

import entities.Funcionario;

import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);
        Funcionario x;
        x = new Funcionario();

        System.out.print("Nome: ");
        x.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        x.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        x.imposto = sc.nextDouble();

        System.out.printf("Funcionario: %s, $ %.2f %n", x.nome, x.salarioLiquido());

        System.out.println();
        System.out.print("Qual a porcentagem do aumento do salario? ");
        double porcentagem = sc.nextDouble();
        x.salarioAumentado(porcentagem);

        System.out.println();
        System.out.printf("Dados atualizado: %s, $ %.2f %n", x.nome, x.salario);
    }
}
