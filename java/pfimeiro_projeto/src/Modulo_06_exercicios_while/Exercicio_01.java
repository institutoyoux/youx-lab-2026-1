package Modulo_06_exercicios_while;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double senha = sc.nextDouble();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextDouble();

        }
        System.out.println("Acesso Permitido");
    }

}
