package s08_introducao_poo.exercicio03.program;


import s08_introducao_poo.exercicio03.entities.Notas;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Notas notas = new Notas();


        notas.name = sc.nextLine();
        notas.nota1 = sc.nextDouble();
        notas.nota2 = sc.nextDouble();
        notas.nota3 = sc.nextDouble();
        System.out.println("nota final: " + notas.notaFinal());
        double pontos = 60 - notas.notaFinal();

        if (notas.notaFinal() >= 60 ) {
            System.out.println(" aprovado ");

        }
        else {
            System.out.println("reprovado");
            System.out.printf("faltaram %.2f ", pontos);
        }





    }
}
