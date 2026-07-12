import entities.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        input.close();
        Usuario usuario = new Usuario(nome, idade);
        System.out.println("--- Cadastro ---");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
    }
}