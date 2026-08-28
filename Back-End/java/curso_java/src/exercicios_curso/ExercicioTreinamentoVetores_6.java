package exercicios_curso;

import java.util.Locale;
import java.util.Scanner;
import entities.EntitiesVetores;

public class ExercicioTreinamentoVetores_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai ter cada vetor? ");
        int n = sc.nextInt();
        EntitiesVetores[] vectA = new EntitiesVetores[n];
        EntitiesVetores[] vectB = new EntitiesVetores[n];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i<n; i++){
            double numero = sc.nextDouble();
            vectA[i] = new EntitiesVetores(numero);
        }
        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i<n; i++){
            double numero = sc.nextDouble();
            vectB[i] = new EntitiesVetores(numero);
        }
        System.out.println("Valor resultante:");
        for(int i = 0; i<n; i++){
            System.out.println(vectA[i].getNumero() +  vectB[i].getNumero());
        }
    }
}
