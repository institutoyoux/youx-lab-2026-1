package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    static void main() {

        Scanner sc = new Scanner(System.in);

        Set<Integer> alunos = new HashSet<>();

        System.out.print("Quantos alunos no curso A: ");
        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            alunos.add(sc.nextInt());
        }

        System.out.print("Quantos alunos no curso B: ");
        quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            alunos.add(sc.nextInt());
        }

        System.out.print("Quantos alunos no curso C: ");
        quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            alunos.add(sc.nextInt());
        }

        System.out.println("Total de alunos: " + alunos.size());

        sc.close();
    }
}
