package enumeracoes_composicoes;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities_enums.WorkerLevel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter department's name:");
        String departmentName = sc.nextLine();

        Department dept = new Department(departmentName);

        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        String workerName  = sc.nextLine();
        System.out.println("Level: ");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());
        System.out.println("Base salary:");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(dept,baseSalary,workerLevel,workerName);

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1 ; i<=n ; i++ ) {
            System.out.println("Enter the #"+ i + "data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate contractDate = LocalDate.parse(sc.next(), fmt);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration: ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3,7));
        System.out.println("Name: "+worker.getName());
        System.out.println("Departamento: "+worker.getDepartament().getName());

        IO.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();

    }
}