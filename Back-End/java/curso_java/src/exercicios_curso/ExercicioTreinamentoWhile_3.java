package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoWhile_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int cliente = 0;
        System.out.println("[ID: 1] [Nome:  Alcool  ]");
        System.out.println("[ID: 2] [Nome: Gasolina ]");
        System.out.println("[ID: 3] [Nome:  Diesel  ]");
        System.out.println("[ID: 4] [     Sair      ]");
        System.out.print("Qual sua preferencia ao abastecer? ");
        id = sc.nextInt();
        if (id == 1){
            alcool += 1;
        }
        else if (id == 2){
            gasolina += 1;
        }
        else if (id == 3){
            diesel += 1;
        }
        while (id != 4){
            System.out.print("Continuar com a avaliação? ");
            id = sc.nextInt();
            if (id == 1){
                alcool += 1;
            }
            else if (id == 2){
                gasolina += 1;
            }
            else if (id == 3){
                diesel += 1;
            }
            while (id < 1 || id > 4) {
                System.out.print("Opção invalida tente novamente: ");
                id = sc.nextInt();
            }
        }
        System.out.print("[ID: 1] [Nome:  Alcool  ] %d%n".formatted(alcool));
        System.out.print("[ID: 2] [Nome: Gasolina ] %d%n".formatted(gasolina));
        System.out.print("[ID: 3] [Nome:  Diesel  ] %d%n".formatted(diesel));
        System.out.println("Obrigado!");
    }
}






