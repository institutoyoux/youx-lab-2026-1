import entities.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many employees will be registered: ");
        Funcionario[] funcionarios = new Funcionario[input.nextInt()];
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionario #" + (i+1));
            System.out.print("Id: ");
            int id = input.nextInt();
            if (i == 0 || !buscarId(id, funcionarios)) {
                System.out.print("Name: ");
                String name = input.next();
                System.out.print("Salary: ");
                Double salary = input.nextDouble();
                funcionarios[i] = new Funcionario(id, name, salary);
            } else {
                while (buscarId(id, funcionarios)) {
                    System.out.print("Id já em uso! Digite novamente: ");
                    id = input.nextInt();
                }
                System.out.print("Name: ");
                String name = input.next();
                System.out.print("Salary: ");
                Double salary = input.nextDouble();
                funcionarios[i] = new Funcionario(id, name, salary);

            }
        }
        System.out.print("Enter the employee id that will have slary increase: ");
        int idSum = input.nextInt();
        if (buscarId(idSum, funcionarios)) {
            for (int i = 0; i < funcionarios.length; i++) {
                Funcionario funcionario = funcionarios[i];
                if (funcionario.getId() == idSum) {
                    System.out.print("Enter percentage: ");
                    funcionario.reajust(input.nextDouble());
                }
            }
        } else {
            while (!buscarId(idSum, funcionarios)) {
                System.out.print("Id incorreto digitado, tente novamente: ");
                idSum = input.nextInt();
            }
            for (int i = 0; i < funcionarios.length; i++) {
                Funcionario funcionario = funcionarios[i];
                if (funcionario.getId() == idSum) {
                    System.out.print("Enter percentage: ");
                    funcionario.reajust(10.0);
                }
            }
        }
        for (Funcionario funcionario : funcionarios) {
            funcionario.info();
        }
    }
    public static Boolean buscarId(int id, Funcionario[] funcionarios) {
        int sum = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null && funcionario.getId() == id) {
                return true;
            }
        }
        return false;
    }
}