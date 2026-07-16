package application;
import java.util.Locale;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Gross salary: ");
        double salary = sc.nextDouble();
        System.out.println("Tax: ");
        double tax = sc.nextDouble();

        
    }
}
