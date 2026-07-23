package application;

import entities.Locatario;

import java.util.Scanner;

public class Program {

    public  static void main() {

        Scanner sc = new Scanner(System.in);

        Locatario[] locatarios = new Locatario[10];

        System.out.print("Quantos quarto serão alugados? ");
        int quantidade = sc.nextInt();

        for (int i=1; i <= quantidade; i++) {
            System.out.println("Aluguel " + i);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Numero do quarto: ");
            int quarto = sc.nextInt();

            locatarios[quarto] = new Locatario(nome, email);
        }

        System.out.println("Quartos ocupados:");

        for (int i=0; i < locatarios.length; i++) {
            if (locatarios[i] != null) {
                System.out.printf("%d: %s, %s %n", i, locatarios[i].getNome(), locatarios[i].getEmail());
            }
        }

        sc.close();
    }
}
