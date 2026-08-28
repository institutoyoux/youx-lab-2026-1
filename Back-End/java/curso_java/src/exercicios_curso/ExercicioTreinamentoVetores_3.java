package exercicios_curso;
import java.util.Scanner;
import java.util.Locale;
import entities.EntitiesVetores;
public class ExercicioTreinamentoVetores_3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pssoas serão digitadas? ");
        double med = 0;
        int n = sc.nextInt();
        double porcentagem = 100 / (double) n ;
        double totalPorcentagem = 0;
        EntitiesVetores[] vect = new EntitiesVetores[n];

        for (int i = 0; i<n; i++){
            sc.nextLine();
            System.out.print("Dados da pessoa (%d)%n".formatted(i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new EntitiesVetores(nome, idade, altura);
        }
        for (int i = 0; i<n;i++){
            med += vect[i].getAltura();
        }
        med = med / n;
        System.out.print("Altura media: %.2f%n".formatted(med));
        for (int i = 0; i<n;i++){
            if(vect[i].getIdade() <= 16){
                totalPorcentagem += porcentagem;
            }
        }
        System.out.print("Pessoas com 16 ou menos anos: %.1f".formatted(totalPorcentagem));
        System.out.println("%");
        for (int i = 0; i<n;i++){
            if(vect[i].getIdade() <= 16){
                System.out.println(vect[i].getNome());
            }
        }
        sc.close();
    }
}