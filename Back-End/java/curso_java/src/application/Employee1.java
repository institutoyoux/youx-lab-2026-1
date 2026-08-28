package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee2;
public class Employee1 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee2 emp = new Employee2();
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        System.out.printf("Employee: %s, %.2f%n", emp.name,emp.netSalary());
        System.out.print("Which percentage to increase salary? ");
        emp.increaseSalary(sc.nextDouble());
        System.out.printf("Updated employee data: %s, %.2f%n", emp.name,emp.netSalary());
    }
}
