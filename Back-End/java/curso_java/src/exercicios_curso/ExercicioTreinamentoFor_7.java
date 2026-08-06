package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoFor_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int teste1 = 0;
        int teste2 = 0;
        int teste3 = 0;
        for(int i = 1; i <= numero; i++){
            teste1 = i;
            teste2 = i*i;
            teste3 = i*i*i;
            System.out.print("%d %d %d%n".formatted(teste1,teste2,teste3));
        }
        sc.close();
    }
}
