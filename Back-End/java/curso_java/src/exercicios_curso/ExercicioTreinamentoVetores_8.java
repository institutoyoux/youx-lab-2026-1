package exercicios_curso;

import java.util.Locale;
import java.util.Scanner;
import entities.EntitiesVetores;

public class ExercicioTreinamentoVetores_8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar? ");
        int n = sc.nextInt();
        EntitiesVetores[] vect = new EntitiesVetores[n];

        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            double numero = sc.nextDouble();
            vect[i] = new EntitiesVetores(numero);
        }
    }
}
