package s10_comportamento_de_memoria_arrays_listas.vetores_pt2.application;

import s10_comportamento_de_memoria_arrays_listas.vetores_pt2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i< vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(price, name);
        }
        double sum = 0.0;
        for(int i=0; i<n; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("AVAREGE PRICE = %.2f%n", avg);



    }
}
