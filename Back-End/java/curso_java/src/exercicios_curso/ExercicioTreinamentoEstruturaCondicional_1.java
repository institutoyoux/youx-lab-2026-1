package exercicios_curso;

import java.util.Scanner;

public class ExercicioTreinamentoEstruturaCondicional_1 {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero = valor.nextDouble();

        if (numero >= 0){
            System.out.print("Não negativo");
        }
        else {
            System.out.print("Negativo");
        }
    }
}
