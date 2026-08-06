package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoFor_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros quer ler?: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            int x = sc.nextInt();
            if (x>=10&&x<=20){
                in += 1;
            }
            else{
                out += 1;
            }
        }
        System.out.print("In: %d%n".formatted(in));
        System.out.print("Out: %d%n".formatted(out));
    }
}
