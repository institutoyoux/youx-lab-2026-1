package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio03_alturas;

import java.util.Scanner;

public class Exercicio_03 {
    public  static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas pessoas serao digitadas");
        int num = sc.nextInt();
        int np = 0;
        double soma = 0;
        for (int i=0; i<num; i++ ) {
            System.out.println("Dados da pessoa");
            System.out.println("nome");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("idade");
            int idade = sc.nextInt();
            System.out.println("altura");
            double altura = sc.nextDouble();
            soma += altura;
            if ( idade < 16) {
                np += 1;
            }


        }
        double media = soma / num;
        double porc = np / num * 100;
        System.out.printf("media: %.1f ", media);
        System.out.printf("porcentagem: %.1f", porc);


    }
}
