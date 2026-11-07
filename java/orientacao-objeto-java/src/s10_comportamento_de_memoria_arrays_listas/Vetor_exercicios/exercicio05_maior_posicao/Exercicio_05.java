package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio05_maior_posicao;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int num = sc.nextInt();
        int [] vect = new int[num];
        int maior = 0;
        int posicao = 0;
        for (int i=0; i<num; i++) {
            System.out.println("Digite um numero:");
            int dgt = sc.nextInt();
            vect[i] = dgt;
        }
        for (int i=0; i<vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posicao = i;
            }


        }
        System.out.println("Maior valor: " + maior);
        System.out.println("posicao do maior valor = " + posicao);


    }



}
