package application;

import entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        Alunos[] aluno = new Alunos[n];

        for (int i=0; i< aluno.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %d aluno:%n", i+1);
            sc.nextLine();
            String nome = sc.nextLine();
            double semestre1 = sc.nextDouble();
            double semestre2 = sc.nextDouble();
            aluno[i] = new Alunos(nome, semestre1, semestre2);
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < aluno.length; i++) {
            if ((aluno[i].getSemestre1() + aluno[i].getSemestre2()) / 2 > 6) {
                System.out.println(aluno[i].getNome());
            }
        }

        sc.close();
    }
}
