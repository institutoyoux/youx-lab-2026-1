package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio09_mias_velho;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("quantas pessoas voce vai digitar");
        int num = sc.nextInt();
        pessoas vect[] = new pessoas[num];
        for(int i=0; i<num; i++) {

            System.out.println("Dados da pessoa");
            System.out.println("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("idade:");
            int idade = sc.nextInt();
            vect[i]= new pessoas(nome,idade);

        }
        int idv = 0;
        for (int i=0; i<vect.length; i++) {
            if(vect[i].getIdade() > idv) {
                idv =vect[i].getIdade();
            }

        }
        for (int i=0; i< vect.length; i++) {
            if (vect[i].getIdade()==idv) {
                System.out.println("pessoa mais velha: " + vect[i].getName());
            }
        }







    }
}