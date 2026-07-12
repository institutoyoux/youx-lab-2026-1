import entities.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        Usuario usuario = new Usuario(input.next(), 1000.0);
        int opcao = 0;
        while (opcao != 4) {
            menu();
            System.out.print("Digite uma opção: ");
            opcao = input.nextInt();
            if (opcao == 1) {
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Saldo: " + usuario.getSaldo());
            }
            if (opcao == 2) {
                System.out.print("Digite o valor: ");
                usuario.deposit(input.nextDouble());
            }
            if (opcao == 3) {
                System.out.print("Digite o valor (terá uma taxa de 5 R$): ");
                try {
                    usuario.saque(input.nextDouble());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    public static void menu() {
        System.out.println("1 - Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
    }
}