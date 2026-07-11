import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        int chute = input.nextInt();
        while (chute != 2002) {
            System.out.println("Senha incorreta!");
            System.out.print("Digite a senha: ");
            chute = input.nextInt();
        }
        System.out.println("Senha correta! Programa encerrado.");
    }
}