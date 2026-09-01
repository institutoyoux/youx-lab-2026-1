package vetores;
import entities.DesafioVet;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos serao ocupados?");
        int quant = sc.nextInt();
        DesafioVet[] quarto = new DesafioVet[10];

        for (int i = 0; i< quant; i++) {
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Email");
            String email = sc.next();
            System.out.println("Numero do quarto:");
            int numero = sc.nextInt();
            quarto[i] = new DesafioVet(nome,email,numero);

        }

        for(int i = 0; i < quant; i++){
            System.out.println(quarto[i].infos());
        }

//               for (int i = 0;i<quant;i++) {
//            System.out.println(infos);
          sc.close();
//        }
    }


}