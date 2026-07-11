package application;

import entities.Contrato;
import entities.Parcela;
import services.ContratoService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite os dados do contrato:");
        System.out.print("Numero: ");
        int number = input.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(input.next(), formatter);
        System.out.print("Valor do contrato: ");
        Double total = input.nextDouble();
        Contrato contrato = new Contrato(number, data, total);
        System.out.print("Quantas parcelas?: ");
        int parcelas = input.nextInt();
        ContratoService contratoService = new ContratoService(new PaypalService());
        contratoService.processContract(contrato, parcelas);
        System.out.println("Parcelas:");
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela);
        }
    }
}