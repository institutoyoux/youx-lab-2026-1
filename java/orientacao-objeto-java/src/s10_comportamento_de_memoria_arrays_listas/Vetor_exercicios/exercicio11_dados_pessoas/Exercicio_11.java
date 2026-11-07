package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio11_dados_pessoas;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas pesssoas serao digitadas ");
        int num = sc.nextInt();
        pessoa[] vect = new pessoa[num];
        for (int i=0; i<num; i++) {
            System.out.println("altura da pessoa: ");
            double altura = sc.nextDouble();
            System.out.println("genero da pessoa");
            sc.nextLine();
            String genero = sc.nextLine();
            vect[i]=new pessoa(altura,genero);
        }
        double menor =0;
        double maior =0;
        double media=0;
        double mulher=0;
        double homem=0;

        for (int i=0; i< vect.length; i++) {
            if (i==0) {
                menor = vect[i].getAltura();
            }
            else if (vect[i].getAltura() < menor) {
                menor = vect[i].getAltura();
            }
            else if (vect[i].getAltura() > maior) {
                maior = vect[i].getAltura();
            }
            else if (vect[i].getGenero() == "f" ) {
                media = vect[i].getAltura();
                mulher += 1;

            }
            else {
                homem += 1;
            }
        }
        System.out.println("menor altura"+ menor);
        System.out.println("maior altura" + maior);
        System.out.println("meida das alturas da mulheres = " + media/mulher);





    }
}
