package application;
import entities.Conversor;
import java.util.Scanner;

public class Exerc_dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do dolar:");
        double dolar = sc.nextDouble();

        System.out.println("Quantos dolares vao ser comprados:");
        double quant = sc.nextDouble();

        double valorConvertido = Conversor.pagar(dolar,quant);

        System.out.printf("O valor que deverá ser pago é de %.2f%n: ", valorConvertido);
    }


}
