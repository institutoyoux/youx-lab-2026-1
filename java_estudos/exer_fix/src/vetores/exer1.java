package vetores;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double [n];

        for (int i = 0;i< vect.length;i++) {
            vect[i] = sc.nextDouble();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0;i< vect.length;i++) {
            if (vect[i]<0) {
                double negativo =+ vect[i];
                System.out.println(negativo);
            }
        }


        sc.close();
    }
}
