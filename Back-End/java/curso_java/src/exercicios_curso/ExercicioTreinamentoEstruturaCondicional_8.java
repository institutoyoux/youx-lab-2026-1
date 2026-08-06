package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoEstruturaCondicional_8 {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);
        System.out.print("Digite a renda: ");
        double valor = teste.nextFloat();
        double imposto = 0;
        if (valor <= 2000) {
            System.out.println("Imposto de renda: Isento");
        }
        else if (valor > 2000 && valor <= 3000) {
            imposto = valor * 0.08;
        }
        else if (valor > 3000 && valor <= 4500) {
            imposto = valor * 0.18 + 1000 * 0.08;
        }
        else {
            imposto = valor * 0.28;
        }
        System.out.print(imposto);
    }
}

