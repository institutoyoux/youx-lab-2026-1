package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program {

    void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        IO.print("Enter departament's name: ");
        String departmentName = sc.nextLine();

        Department dept = new Department(departmentName);

        IO.println("Enter woekwe data:");
        IO.print("Name: ");
        String workerName = sc.nextLine();
        IO.print("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());
        IO.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, workerLevel, baseSalary, dept);

        IO.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            IO.println("Enter contract #" + i + ":");
            IO.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
            IO.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            IO.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        IO.println();
        IO.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        IO.println("Name: " + worker.getName());
        IO.println("Departament: " + worker.getDepartment().getName());
        IO.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}