package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Digite o numero de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do #" + i + " contribuinte:");
            System.out.print("Pessoa Fisica ou Juridica (f/j)? ");
            char resposta = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (resposta == 'f') {
                System.out.print("Gastos com saúde: ");
                double saude = sc.nextDouble();
                contribuintes.add(new PessoaFisica(nome, rendaAnual, saude));
            }
            else {
                System.out.print("Numero de funcionarios: ");
                int funcionarios = sc.nextInt();
                contribuintes.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
            }
        }

        double soma = 0;
        System.out.println();
        System.out.println("Impostos pago:");
        for (Contribuinte c: contribuintes) {
            System.out.println(c.informacoes());
            soma += c.imposto();
        }

        System.out.println();
        System.out.println("Total dos impostos: " + soma);

        sc.close();
    }
}
