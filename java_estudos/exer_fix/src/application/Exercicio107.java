package application;

import entities.Exer107;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos funcionarios serao registrados?");
        int quant = sc.nextInt();
        List<Exer107> func = new ArrayList<>();

        for (int i = 0 ; i<quant ; i++) {
            System.out.println("Funcionario "+ (i+1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();

            func.add(i, new Exer107(id, nome, salario));
        }

        System.out.println("Digite o id do funcionario que recebera um aumento no salario: ");
        int idBuscador = sc.nextInt();
        Exer107 funcionarioEncontrado = null;
        for (Exer107 f: func) {
            if(f.getId() == idBuscador) {
                funcionarioEncontrado = f;
                break;
            }
        }

        if (funcionarioEncontrado != null) {
            System.out.println("Digite a porcentagem de aumento para "+funcionarioEncontrado.getNome() + ":");
            double porcentagem = sc.nextDouble();

            funcionarioEncontrado.aumentoSalario(porcentagem);


            for (Exer107 f: func) {
                System.out.println(f.infos());
            }
        }

        if (funcionarioEncontrado == null) {
            System.out.println("Esse ID nao existe");
            for (Exer107 f: func) {
                System.out.println(f.infos());
            }
        }

    }
}