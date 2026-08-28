//package entities.workerFile;
//
//import entities.workerFile.enums.WorkerLevel;
//
//import java.text.ParseException;
//import java.util.Date;
//import javax.xml.crypto.Data;
//import java.text.SimpleDateFormat;
//import java.util.Scanner;
//
//public class Program {
//    public static void main(String[] args) throws ParseException{
//        Scanner sc = new Scanner(System.in);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        System.out.print("Enter department's name: ");
//        String departmentName = sc.nextLine();
//        System.out.println("Enter workes data: ");
//        System.out.print("Name: ");
//        String workerName = sc.nextLine();
//        System.out.print("Level: ");
//        String workerLevel = sc.nextLine();
//        System.out.print("Base salary: ");
//        double baseSalary = sc.nextDouble();
//        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
//
//        System.out.print("How many contracts to this worker?");
//        int n = sc.nextInt();
//
//        for (int i=1; i<=n; i++) {
//            System.out.println("Enter contract #" + i + " data");
//            System.out.print("Date (DD|MM|YYYY)");
//            Data contractDate = sdf.parse(sc.next());
//            System.out.print("Value per hour: ");
//            double valuePerHour = sc.nextDouble();
//            System.out.print("Duration (hours); ");
//            int hour = sc.nextInt();
//            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
//            worker.addContract(contract);
//        }
//
//        System.out.println();
//        System.out.print("Enter month and year to calculate income (MM|YYYY): ");
//        String monthAndYear = sc.next();
//        int month = Integer.parseInt(monthAndYear.substring(0,2));
//        int year    = Integer.parseInt(monthAndYear.substring(3));
//        System.out.println("Nome: " + worker.getName());
//        String monthAndYear = sc.next();
//        int month = Integer.parseInt(monthAndYear.substring(0,2));
//        int year = Integer.parseInt(monthAndYear.substring(3));
//}
