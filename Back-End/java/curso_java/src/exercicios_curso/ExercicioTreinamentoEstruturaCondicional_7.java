package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoEstruturaCondicional_7 {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);
        double X = 0;
        double Y = 0;
        System.out.print("Digite um valor para X: ");
        double valorX = teste.nextFloat();
        System.out.print("Digite um valor para Y: ");
        double valorY = teste.nextFloat();
        if (valorX < 0 && valorY < 0){
            System.out.println("Posição: Q3");
        }
        if (valorX > 0 && valorY > 0){
            System.out.println("Posição: Q1");
        }
        if (valorX > 0 && valorY < 0){
            System.out.println("Posição: Q4");
        }
        if (valorX < 0 && valorY > 0){
            System.out.println("Posição: Q2");
        }
    }
}
