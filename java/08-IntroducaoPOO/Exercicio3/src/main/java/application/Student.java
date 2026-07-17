package application;

import java.util.Locale;
import java.util.Scanner;



public class Student {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome, e as tres notas: ");
        String name = sc.nextLine();
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double boletim = n1 + n2 + n3;
        String situacao = " ";
        if (boletim >= 60) {
            situacao = "PASS";
            System.out.printf("SITUAÇÃO: " + situacao);        }
        else if (boletim < 60) {
            situacao = "FAILED";
            System.out.println("SITUAÇÃO: " + situacao);
            System.out.printf("REPROVADO FALTANDO " + (60 - boletim) + "PTS");
        }

    }
}
