package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Reajuste;

public class Employee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Reajuste rjs = new Reajuste();

        System.out.printf("Name: ");
        rjs.name = sc.nextLine();
        System.out.printf("Gross salary: ");
        rjs.salary = sc.nextDouble();
        System.out.printf("Tax: ");
        rjs.tax = sc.nextDouble();
        double netSalary = rjs.NetSalary(rjs.salary,  rjs.tax);
        System.out.println("Employee: " + rjs.name + ", " + netSalary);
        System.out.printf("Wich percentage to increase salary? ");
        rjs.percentage = sc.nextDouble();
        double IncreaseSalary = rjs.IncreaseSalary(rjs.salary,  rjs.percentage);
        System.out.println("Updated data: " + rjs.name + ", " + IncreaseSalary);

        
    }
}
