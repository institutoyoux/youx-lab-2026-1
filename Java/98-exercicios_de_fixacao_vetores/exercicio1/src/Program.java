import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for (int i=0; i< numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numero negativos:");

        for (int i=0; i< numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
