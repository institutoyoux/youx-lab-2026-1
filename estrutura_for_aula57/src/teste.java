import java.util.Scanner;

public class teste {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Repetições:");

        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++){

            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.print("SOMA:" + soma);
            sc.close();
    }
}
