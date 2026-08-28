package exercicios_curso;
import java.util.Locale;
import java.util.Scanner;
import entities.EntitiesVetores;
public class ExercicioTreinamentoVetores_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar? ");
        int n = sc. nextInt();
        double maior = 0;
        int posicao = 0;
        EntitiesVetores[] vect = new EntitiesVetores[n];
        for(int i = 0; i<n; i++) {
            System.out.print("Digite um numero para a posição [%d]: ".formatted(i));
            double numero = sc.nextDouble();
            vect[i] = new EntitiesVetores(numero);
        }

        for(int i = 0; i<n; i++) {
            if(vect[i].getNumero() > maior){
                maior = vect[i].getNumero();
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);

    }

}
