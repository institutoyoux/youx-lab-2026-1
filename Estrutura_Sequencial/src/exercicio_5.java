import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int cod1,cod2,quantidade1,quantidade2;
        double valor1,valor2;

        System.out.print("Digite o código da peça 1: ");
        cod1 = sc.nextInt();

        System.out.print("Digite o código da peça 2: ");
        cod2 = sc.nextInt();

        System.out.print("Digite a quantidade de peças cod1: ");
        quantidade1 = sc.nextInt();

        System.out.print("Digite a quantidade de peças cod2: ");
        quantidade2 = sc.nextInt();


        System.out.print("Digite o valor da peça cod1: ");
        valor1 = sc.nextDouble();

        System.out.print("Digite o valor da peça cod2: ");
        valor2 = sc.nextDouble();

        double soma = (valor1 * quantidade1) + (valor2 * quantidade2);
        System.out.print("Valor Total: " + soma);
    }
}
