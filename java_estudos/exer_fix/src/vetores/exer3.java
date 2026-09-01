package vetores;
import java.util.Locale;
import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao analisadas?");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for(int i = 0;i<n;i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.println("Nome da pessoa: ");
            nomes[i] = sc.next();
            System.out.println("Idade da pessoa: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura da pessoa: ");
            alturas[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0;i<n;i++) {
            soma += alturas[i];
        }

        double avg = soma / n;

        int cont = 0;
        for (int i = 0;i<n;i++) {
            if (idades[i] <= 16) {
                cont ++;
            }
        }

        double porcentagem = cont * 100 / n;
        System.out.printf("Altura media:  %.2f%n",avg);
        System.out.printf("Porcentagem das pessoas menores de 16 anos: %.1f%%%n",porcentagem);
        System.out.println("Nomes das pessoas que sao menores de 16 anos: ");
        for (int i = 0; i<n;i++) {
            if (idades[i] <= 16) {
                String menores = nomes[i];
                System.out.println(menores);
            }

        }


    sc.close();
    }
}
