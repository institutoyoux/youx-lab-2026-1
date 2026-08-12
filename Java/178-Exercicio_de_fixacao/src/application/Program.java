package application;

import model.entities.Contract;
import model.service.ContractService;
import model.service.PaypalService;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();
        System.out.print("Entre o numero de parcelas: ");
        int parcelas = sc.nextInt();

        Contract contrato = new Contract(numero, data, valorContrato);
        ContractService service = new ContractService(new PaypalService());

        service.processContract(contrato, parcelas);

        System.out.println("Parcelas: ");
        System.out.println(contrato.toString());

        sc.close();
    }
}