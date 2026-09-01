package application;
import java.util.Scanner;
import java.util.Locale;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Quantos numeros vai ter o vetor
        double[] vect = new double [n]; //Como se cria um vetor,e usa o n de parametro pro tamanho


        for (int i=0;i<n;i++) {
            vect[i] = sc.nextDouble(); //enquanto o i for menor que n,o vetor vai pedir um numero
        }

        double sum = 0;

        for (int i=0;i<n;i++) {
            sum += vect[i];   //enquanto o i for menor que n,o vetor vai somar o i,ou seja cada numero (o "i" serve pra isso,pra nao ir todo o vetor de uma vez)
        }

        double avg = sum / n;

        System.out.printf("Media Altura %.2f%n: ",avg);
    }
}
