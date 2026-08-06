package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoWhile_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nova senha: ");
        int senha = sc.nextInt();
        System.out.print("Digite a senha: ");
        int tentativa = sc.nextInt();
        while (tentativa != senha){
            System.out.print("Senha errada tente novamente: ");
            tentativa = sc.nextInt();
        }
        System.out.println("Senha correta");
    }
}
