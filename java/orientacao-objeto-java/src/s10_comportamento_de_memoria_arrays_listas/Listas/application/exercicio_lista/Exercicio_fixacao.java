package s10_comportamento_de_memoria_arrays_listas.Listas.application.exercicio_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_fixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionaro> list = new ArrayList<>();
        System.out.println("quantos funcionarios serao registrados:");
        int qnt = sc.nextInt();
        for (int i=0; i<qnt; i++ ) {
            System.out.println("Funcionario: ");
            System.out.println("id: ");
            int id = sc.nextInt();
            System.out.println("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("salario: ");
            double salario = sc.nextDouble();


            list.add(new Funcionaro(id,nome,salario));


        }
        System.out.println("Digite o id do funcionario que tera o salario aumentado");
        int id_aumento = sc.nextInt();
        System.out.println("digite a porcentagem:");
         double prct = sc.nextDouble();
        System.out.println("lista de funcionarios");

        for (Funcionaro f : list) {
             if (id_aumento == f.getId()) {
                 f.aumentoSalario(prct);
             }
            System.out.println(f.getId()+ " " + f.getNome()+ " " + f.getSalary());
         }



    }

}
