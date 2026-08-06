package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoEstruturaCondicional_4 {
    public static void main (String[] args){
        Scanner teste = new Scanner(System.in);
        int tempo1 = 0;
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 24;
        int contador1 = 1;
        while (contador1 == 1) {
            contador1 = contador1 - contador1 + 1;
            System.out.print("Digite o valor (A) ");
            valor1 = teste.nextInt();
            System.out.print("Digite o valor (B) ");
            valor2 = teste.nextInt();
            if (valor1 + valor2 > 24){
                System.out.println("Valores errados superiores ou inferiores a 24h");
            }
            else {
                contador1 += 1;
            }
        }
        if (valor1 > valor2) {
            tempo1 = valor3 - valor1 + valor2;
        }
        if (valor1 < valor2) {
            tempo1 = valor2 - valor1;
        }
        if (valor1 == valor2) {
            tempo1 = 24;
        }
        System.out.print("O jogo durou " + tempo1 + " Hora(s)");
    }
}
// if t1 > t2 = t1 - 24 + t2
// if t1 < t2 = t1 - t2