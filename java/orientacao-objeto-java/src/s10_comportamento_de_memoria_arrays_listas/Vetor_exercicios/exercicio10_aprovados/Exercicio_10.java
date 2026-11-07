package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio10_aprovados;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos alunos serao digitados?");
        int num = sc.nextInt();
        Alunos[] vect = new Alunos[num];
        for (int i = 0; i < num; i++) {
            System.out.println("digite o nome, primeira e segunda nota do aluno");
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vect[i] = new Alunos(nota1, nome, nota2);

        }
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNota1() + vect[i].getNota2() >= 6) {
                System.out.println(vect[i].getName());
            }
        }
    }
}