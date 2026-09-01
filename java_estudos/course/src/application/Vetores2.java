package application;
import entities.Vetor2;
import java.util.Scanner;

public class Vetores2 {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vetor2[] vect = new Vetor2[n];

        for (int i = 0;i<n;i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Vetor2(name,price);
        }

        double sum = 0;

        for (int i =0; i<n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Media dos Precos: %.2f%n",avg);
    }
}
