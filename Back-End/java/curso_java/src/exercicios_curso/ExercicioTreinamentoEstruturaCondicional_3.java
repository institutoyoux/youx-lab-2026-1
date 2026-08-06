package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoEstruturaCondicional_3 {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        int contador = 1;
        int contador2 = 1;
        int contador3 = 1;
        int contador4 = 1;
        int resultado = 0;
        int resultado2 = 0;
        String numero = "";
        String numero2 = "";
        String entrada = "S";
        while (contador == 1) {
            while (contador != 1 || contador2 != 1 || contador3 != 1 || resultado != 0 || resultado2 != 0) {
                contador = contador - contador + 1;
                contador2 = contador2 - contador2 + 1;
                contador3 = contador3 - contador3 + 1;
                contador4 = contador4 - contador4 + 1;
                resultado = resultado - resultado;
                resultado2 = resultado2 - resultado2;
            }
            while (contador3 == 1) {
                System.out.print("Digite o valor (A): ");
                numero = teste.next();
                try {
                    resultado += Integer.parseInt(numero);
                    contador3 += 1;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: Numero invalido ou escrito de forma errada, tente novamente.");
                }}
            while (contador4 == 1) {
                System.out.print("Digite o valor (B): ");
                numero2 = teste.next();
                try {
                    resultado2 += Integer.parseInt(numero2);
                    contador4 += 1;
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: Numero invalido ou escrito de forma errada, tente novamente.");
                }
            }
                if (resultado % resultado2 == 0 || resultado2 % resultado == 0) {
                    System.out.println("São multiplos");
                }
                else{
                    System.out.println("Não são multiplos");
                }
            System.out.print("Quer continuar? [S|N]: ");
            entrada = teste.next();
            if (entrada.equalsIgnoreCase("n")) {
                contador += 1;
            } else if (entrada.equalsIgnoreCase("s")) {
                contador += 0;
            } else {
                while (contador2 == 1) {
                    System.out.println("Digite alguma expressão valida");
                    System.out.print("Quer continuar? [S|N]: ");
                    entrada = teste.next();
                    if (entrada.equalsIgnoreCase("n")) {
                        contador += 1;
                        contador2 += 1;
                    } else if (entrada.equalsIgnoreCase("s")) {
                        contador2 += 1;
                    }
                    else{
                        contador2 += 0;
                    }
                }
            }
        }
    }
}
