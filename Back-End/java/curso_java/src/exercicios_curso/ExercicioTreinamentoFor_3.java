package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoFor_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double a = 0;
        double b = 0;
        double c = 0;
        double sum = 0;
        for(int i=0;i<n;i++){
            System.out.println("Digite um valor para:");
            System.out.print("A: ");
            a = sc.nextFloat();
            System.out.print("B: ");
            b = sc.nextFloat();
            System.out.print("C: ");
            c = sc.nextFloat();
            sum = ((a*2) + (b*3) + (c*5))/10;
            System.out.print("Média Ponderada: %.1f%n".formatted(sum));
        }
    }
}
