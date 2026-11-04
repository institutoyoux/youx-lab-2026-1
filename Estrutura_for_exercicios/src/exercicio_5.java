import java.util.Scanner;
public class exercicio_5 {
    public static void main(String[] args) {
        System.out.print("Digite um Número:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fat = 1;

        for(int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        System.out.println("Fatorial :" + fat);

        sc.close();
    }
}
