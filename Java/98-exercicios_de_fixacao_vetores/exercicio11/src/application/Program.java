package application;

import entities.Dados;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Dados[] pessoa = new Dados[n];

        for (int i=0; i< pessoa.length; i++) {
            System.out.printf("Altura da %d pessoa: ", i+1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %d pessoa: ", i+1);
            char genero = sc.next().charAt(0);
            pessoa[i] = new Dados(altura, genero);
        }

        int homens = 0;
        double soma, maior, menor, alturaMulheres;
        soma = 0;
        maior = 0;
        menor = 0;
        alturaMulheres = 0;

        for (int i = 0; i < pessoa.length; i++){
            if (i == 0) {
                maior = pessoa[i].getAltura();
                menor = pessoa[i].getAltura();
            }
            else {
                if (pessoa[i].getAltura() > maior) {
                    maior = pessoa[i].getAltura();
                } else if (pessoa[i].getAltura() < menor) {
                    menor = pessoa[i].getAltura();
                }
            }

            if (pessoa[i].getGenero() == 'f') {
                soma += 1;
                alturaMulheres += pessoa[i].getAltura();
            }
            else {
                homens += 1;
            }
        }

        double media = alturaMulheres / soma;

        System.out.printf("Menor altura: %.2f%n", menor);
        System.out.printf("Mairo altura: %.2f%n", maior);
        System.out.printf("Media de altura das mulheres: %.2f%n", media);
        System.out.printf("Numero de homens = %d%n", homens);

        sc.close();
    }
}
