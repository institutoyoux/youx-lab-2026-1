package application;

import entities.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        List<Funcionarios> funcianario = new ArrayList<>();

        System.out.print("Quantos funcionarios serão cadastrados? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Funcionario %d %n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            funcianario.add(new Funcionarios(id, nome, salario));
        }

        System.out.print("Digite o ID do funcionario que tera um aumento de salario: ");
        int idAumento = sc.nextInt();

        for (Funcionarios f : funcianario) {
            if (idAumento == f.getId()) {
                System.out.print("Qual a porcentagem do aumento? ");
                double porcentagem = sc.nextDouble();
                f.aumentoSalario(porcentagem);
            }
            else {
                System.out.println("O id informado não existe.");
            }
        }

        System.out.println("Lista de funcionarios:");
        for (Funcionarios f : funcianario) {
            System.out.println(f.toString());
        }
    }
}
