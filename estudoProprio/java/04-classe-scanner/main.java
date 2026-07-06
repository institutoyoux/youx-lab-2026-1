import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = 0, n2 = 2, res = 0;
        String nome = "";

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.print("Digite o 1° número: ");
        n1 = scan.nextInt();
        
        System.out.print("digite o 2° número: ");
        n2 = scan.nextInt();
        res = n1 + n2;
        System.out.printf("Olá %s, a soma de %d + %d é = %d\n", nome, n1,n2,res);
    }
}
