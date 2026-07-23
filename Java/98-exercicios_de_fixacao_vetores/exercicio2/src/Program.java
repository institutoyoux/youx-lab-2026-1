import java.util.Scanner;

public class Program {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero vai digitar: ");
        int quantidade = sc.nextInt();

        double[] numeros = new double[quantidade];

        for (int i=0; i< numeros.length;i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double soma = 0;
        double media = soma / numeros.length;

        System.out.print("Valores = ");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
            soma += numeros[i];
        }

        System.out.printf("%nSoma = %.2f%n", soma);
        System.out.printf("Media = %.2f%n", media);

    }
}
