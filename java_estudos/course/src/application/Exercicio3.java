package application;
import entities.Estudante;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante est = new Estudante();

        System.out.println("Digite o nome do aluno:");
        est.nome = sc.nextLine();
        System.out.println("Digite as notas dele:");
        est.n1 = sc.nextInt();
        est.n2 = sc.nextInt();
        est.n3 = sc.nextInt();

        System.out.println("Nota Final: " +est.nota_final());

        System.out.println(est.passa_reprova());
    }
}
