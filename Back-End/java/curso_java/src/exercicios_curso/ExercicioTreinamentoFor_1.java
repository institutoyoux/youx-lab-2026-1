package exercicios_curso;

import java.util.Scanner;

public class ExercicioTreinamentoFor_1 {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = teste.nextInt();
        for(int i=1; i<= num; i+=2){
            System.out.print("Valor de 1: %d%n".formatted(i));
        }
    }
}
