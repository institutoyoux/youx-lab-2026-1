import java.util.Scanner;

public class exer_for {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Exercicio 1");
        int X;
        X = sc.nextInt();
        for (int i = 0;i<=X;i++) {
              if (i % 2 != 0) {
                 System.out.println(i);
             }
        }

        System.out.println("=================================");
        System.out.println("Exercicio 2");
        int N;
        int in = 0;
        int out = 0;
        N = sc.nextInt();

        for (int p = 0;p<N;p++) {
            int V = sc.nextInt();
            if (V >= 10 && V <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");


        System.out.println("=================================");
        System.out.println("Exercicio  3");
        int N1 = sc.nextInt();
        for (int l = 0; l<N1 ;l++) {
            double C1 = sc.nextInt();
            double C2 = sc.nextInt();
            double C3 = sc.nextInt();

            double media = (C1  * 2.0 + C2 * 3.0 + C3 * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }
        
    }
}
