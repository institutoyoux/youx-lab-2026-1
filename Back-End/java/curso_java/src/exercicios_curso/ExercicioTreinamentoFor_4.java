package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoFor_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double val1 = 0;
        double val2 = 0;
        double val3 = 0;
        for(int i=0;i<n;i++){
            System.out.println("Digite valores para A e B:");
            System.out.print("A: ");
            val1 = sc.nextDouble();
            System.out.print("B: ");
            val2 = sc.nextDouble();
            if(val2 == 0){
                System.out.println("Divisão impossivel");
            }
            else{
                val3 = val1 / val2;
                System.out.print("Valor da divisão: %.1f%n".formatted(val3));
            }

        }
    }
}
