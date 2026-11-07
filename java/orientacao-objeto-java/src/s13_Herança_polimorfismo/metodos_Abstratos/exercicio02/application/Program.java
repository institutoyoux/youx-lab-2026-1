package s13_Herança_polimorfismo.metodos_Abstratos.exercicio02.application;


import s13_Herança_polimorfismo.metodos_Abstratos.exercicio02.entities.Company;
import s13_Herança_polimorfismo.metodos_Abstratos.exercicio02.entities.Individual;
import s13_Herança_polimorfismo.metodos_Abstratos.exercicio02.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        System.out.println("Enter the number of tax payers: ");
        int qnt = sc.nextInt();
        for( int i=1; i<qnt; i++) {
            sc.nextLine();
            System.out.println("tax payer #" + i + "data:");
            System.out.print("individual or company (i/c)? ");
            String type = sc.next();
            System.out.println("name: ");
            String name = sc.next();
            System.out.println("Anual income: ");
            double anualIncome = sc.nextDouble();
            switch (type) {
                case "i":
                    System.out.println("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    list.add(new Individual(name, anualIncome, healthExpenditures));
                    break;

                case "c":
                    System.out.println("Number of employees: ");
                    int numberOfEmployees = sc.nextInt();
                    list.add(new Company(name,anualIncome, numberOfEmployees));
                    break;

            }

            double soma = 0;
            System.out.println();
            System.out.println("TAXES PAID: ");
            for (TaxPayer tp : list) {
                double taxa = tp.tax();
                System.out.println(tp.getName() + ": $" + String.format("%.2f",taxa));
                soma += taxa;
            }

            System.out.println();
            System.out.println("TOTAL TAXES: $ " + soma);

        }


    }
}
