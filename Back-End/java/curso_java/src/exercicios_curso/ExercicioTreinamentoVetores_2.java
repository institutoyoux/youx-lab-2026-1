package exercicios_curso;
import java.util.Locale;
import java.util.Scanner;
import entities.EntitiesVetores;
public class ExercicioTreinamentoVetores_2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        double soma = 0;

        EntitiesVetores[] vect = new EntitiesVetores[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            double numero = sc.nextDouble();
            vect[i] = new EntitiesVetores(numero);
        }
        System.out.println("");
        System.out.print("Valores =");
        for(int i=0; i<n; i++){
            System.out.print("  ");
            System.out.print(vect[i].getNumero());
        }
        System.out.println();
        System.out.print("Soma = ");
        for(int i=0; i<n; i++){
            soma += vect[i].getNumero();
        }
        System.out.println(soma);

        System.out.print("Media = ");
        double media = soma / n;
        System.out.println(media);
    }
}
