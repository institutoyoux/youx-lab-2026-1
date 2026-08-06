package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoWhile_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para X: ");
        int X = sc.nextInt();
        System.out.print("Digite um valor para Y: ");
        int Y = sc.nextInt();
        if (X < 0 && Y < 0){
        }
        else if (X > 0 && Y > 0){
            System.out.println("Posição: Q1");
        }
        else if (X > 0 && Y < 0){
            System.out.println("Posição: Q4");
        }
        else {
            System.out.println("Posição: Q2");
        }
        while (X != 0 || Y != 0){
            System.out.print("Digite um valor para X: ");
            X = sc.nextInt();
            System.out.print("Digite um valor para Y: ");
            Y = sc.nextInt();
            if (X < 0 && Y < 0){
                System.out.println("Posição: Q3");
            }
            else if (X > 0 && Y > 0){
                System.out.println("Posição: Q1");
            }
            else if (X > 0 && Y < 0){
                System.out.println("Posição: Q4");
            }
            else{
                System.out.println("Posição: Q2");
            }
        }
    }
}
