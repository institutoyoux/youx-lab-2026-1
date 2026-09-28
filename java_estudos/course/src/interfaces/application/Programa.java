package interfaces.application;

import interfaces.entities.Contrato;
import interfaces.entities.Parcelamento;
import interfaces.entities.ServicoContrato;
import interfaces.entities.ServicoPaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato: ");
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Data: ");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Valor do contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero,data,valorTotal);

        System.out.println("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());

        servicoContrato.processoContratual(contrato,n);

        System.out.println("Parcelas: ");
        for (Parcelamento parcelamento : contrato .getParcelamentos()) {
            System.out.println(parcelamento);

        }



    }
}
