package application;
import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();

        System.out.println("Name:");
        func.nome = sc.nextLine();
        System.out.println("Salario: ");
        func.salario = sc.nextDouble();
        System.out.println("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.println("Funcionario: "+func);

        System.out.println("Quer acrescentar quantos porcento?");
        double porcentagem = sc.nextDouble();
        func.salario_aumentado(porcentagem);
        System.out.println();
        System.out.println("Dados Atualizados: " +func);
        sc.close();
    }


}
