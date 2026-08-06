package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoFor_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        int teste1 = 1;
        for(int i=1; i<=num;i++){
            teste1 *= i;
        }
        if (teste1 == 0){
            teste1 += 1;
        }
        System.out.println(teste1);
    }
}
