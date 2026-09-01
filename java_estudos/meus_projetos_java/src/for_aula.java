import java.util.Scanner;

public class for_aula {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int  N;
        N = sc.nextInt();

        int soma = 0;
        for (int i=0;i<N;i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);

        System.out.println("=================================");
        System.out.println("Contagem");
        for (int i = 0; i < 5;i++) {
            System.out.println("Valor de i: " +i);
        }

        System.out.println("=================================");
        System.out.println("Regressiva");
        for (int i = 6;i >= 0;i--) {
            System.out.println("Valor de i: " +i);
        }

    }
}
