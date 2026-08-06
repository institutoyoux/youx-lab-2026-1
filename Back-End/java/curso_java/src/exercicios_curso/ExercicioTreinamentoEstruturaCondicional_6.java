package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoEstruturaCondicional_6 {
    public static void main(String[] args){
    Scanner teste = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    double numero = teste.nextFloat();
    if (numero >= 0 && numero <= 25){
        System.out.println("Intervalo [0,25]");
    }
    if (numero > 25 && numero <= 50){
        System.out.println("Intervalo [25,50]");
    }
        if (numero > 50 && numero <= 75){
            System.out.println("Intervalo [50,75]");
        }
    if (numero > 75 && numero <= 100){
        System.out.println("Intervalo [75,100]");
    }








    }
}
