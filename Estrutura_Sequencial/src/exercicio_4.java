import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int id;
        double salario,horas,soma;

        System.out.print("Digite seu id: ");
        id = sc.nextInt();

        System.out.print("Horas trabalhadas: ");
        horas = sc.nextDouble();

        System.out.print("Digite seu salário:$R$");
        salario = sc.nextDouble();
        System.out.println("=====================================");
        soma =  horas * salario;
        System.out.println("id = " + id);
        System.out.print("salário = " + soma);
    }
}
