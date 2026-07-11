import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat my = new SimpleDateFormat("MM/yyyy");

        System.out.print("Nome departamento: ");
        Department departamento = new Department(input.next());
        System.out.println("Dados do trabalhador:");
        System.out.print("Nome: ");
        String name = input.next();
        System.out.print("Nivel: ");
        WorkerLevel level = WorkerLevel.valueOf(input.next());
        System.out.print("Salario base: ");
        Double base = input.nextDouble();
        Worker trabalhador = new Worker(name, level, base, departamento);
        System.out.print("Quantos contratos ele possui?: ");
        int quant = input.nextInt();
        for (int i=0; i <= quant; i++) {
            System.out.printf("Dados %d° contrato:\n", i+1);
            System.out.print("Data: ");
            Date data = sdf.parse(input.next());
            System.out.print("Valor por hora: ");
            Double valor = input.nextDouble();
            System.out.print("Duração (horas): ");
            int hours = input.nextInt();
            HourContract contract = new HourContract(data, valor, hours);
            trabalhador.addContact(contract);
        }
        System.out.println("Obter feturamento pela data:");
        System.out.print("Digite o mes e ano para calcular: (MM/YYYY): ");
        String data = input.next();
        int mes = Integer.parseInt(data.substring(0, 2));
        int ano = Integer.parseInt(data.substring(3));
        System.out.println("Nome: " + trabalhador.getName());
        System.out.println("Departamento: " + trabalhador.getDepartment());
        System.out.printf("Faturamento para %d/%d: %s\n", mes, ano, trabalhador.income(ano, mes));

    }
}