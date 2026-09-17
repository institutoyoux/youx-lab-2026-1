import java.util.Scanner;
public class exercicio_7 {

        public static void main(String[] args) {
            System.out.print("Digite um Nùmero:");
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i=1; i<=n; i++) {

                int primeiro = i;
                int segundo = i * i;
                int terceiro = i * i * i;
                System.out.printf("Linha: %d, Quadrado do valor anterior: %d, Cubo do valor anterior: %d%n", primeiro, segundo, terceiro);
            }

            sc.close();
        }
}
