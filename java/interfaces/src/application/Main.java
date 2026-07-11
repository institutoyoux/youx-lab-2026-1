package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String nome = input.nextLine();
        System.out.print("Retidara (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), fmt);
        CarRental carRental = new CarRental(start, finish, new Vehicle(nome));
        BrazilTaxService taxService = new BrazilTaxService();
        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = input.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = input.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoid(carRental);
        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());
    }
}
