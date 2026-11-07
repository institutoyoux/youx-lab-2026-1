package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.desafio_vetores;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many rooms will be rented?");
        int num = sc.nextInt();
        cliente[] vect = new cliente[10];
        for(int i=0; i <num; i++){
            System.out.print("rent:");
            System.out.print("nome");
            sc.nextLine();

            String nome = sc.nextLine();
            System.out.print("email:");
            sc.nextLine();

            String email = sc.nextLine();
            System.out.print("room:");
            int quarto = sc.nextInt();
            vect[quarto]=new cliente(email,nome,quarto);

        }
        for (int i=0; i< vect.length; i++) {
            if(vect[i] != null ) {
                System.out.println(i + ": "+ vect[i].getNome() + " " + vect[i].getEmail());
            }

        }
    }
}
