package interfaces.application;

import interfaces.entities.Locadora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados de aluguel: ");
        System.out.println("Modelo do Carro: ");
        String modelo = sc.next();
        sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataRetirada = sc.nextLine();
        LocalDateTime retirada = LocalDateTime.parse(dataRetirada,formato);
        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        String dataRetorno = sc.nextLine();
        LocalDateTime retorno = LocalDateTime.parse(dataRetorno,formato);

        System.out.println("Entre com o preço por hora: ");
        Double valorPorHora = sc.nextDouble();

        System.out.println("Entre com o preço por dia: ");
        Double valorPorDia = sc.nextDouble();

        Locadora locadora = new Locadora(modelo,retirada,retorno,valorPorHora,valorPorDia);

        System.out.println("FATURA: ");
        System.out.println(locadora.notaFiscal());



    }
}
