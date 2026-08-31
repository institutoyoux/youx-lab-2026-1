package s08_introducao_poo.exercicio02.program;

import s08_introducao_poo.exercicio02.entities.Funcionario;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.name = sc.nextLine();
        System.out.print("salario bruto: ");
        funcionario.salario = sc.nextDouble();
        System.out.println("taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println("employee: " + funcionario.toString());
        System.out.println("Which percentage to increase salary?  ");
        funcionario.aumentoSalario(sc.nextDouble());
        System.out.println("updated data: " + funcionario.toString());





    }
}
