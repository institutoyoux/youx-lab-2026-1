package exercicios_curso;

import java.util.Locale;
import java.util.Scanner;
import entities.EntitiesVetores;

public class ExercicioTreinamentoVetores_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter cada vetor? ");
        int n = sc.nextInt();
        double media = 0;
        EntitiesVetores[] vect = new EntitiesVetores[n];
        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            double numero = sc.nextDouble();
            vect[i] = new EntitiesVetores(numero);
        }

        for(int i = 0; i<n; i++){
            media += vect[i].getNumero();
        }
        media /= n;
        System.out.println(media);
        for(int i = 0; i<n; i++){
            if (vect[i].getNumero() < media){
                System.out.println(vect[i].getNumero());
            }
        }
    }
}
