package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            String op = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anlInc = sc.nextDouble();
            switch (op) {
                case "i" :
                    System.out.print("Health expenditures: ");
                    double hthExp = sc.nextDouble();
                    list.add(new Individual(name, anlInc, hthExp));
                    break;

                case "c" :
                    System.out.print("Number of employees: ");
                    int numEmp = sc.nextInt();
                    list.add(new Company(name, anlInc, numEmp));
                    break;
            }

            double sum = 0;
            System.out.println();
            System.out.println("TAXES PAID");
            for (TaxPayer tp : list) {
                double tax = tp.tax();
                System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
                sum += tax;
            }

            System.out.println();
            System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

            sc.close();
        }
    }
}
