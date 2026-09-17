import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4;

        System.out.print("Digite um número:");
        num1 = sc.nextInt();

        System.out.print("Digite mais um número:");
        num2 = sc.nextInt();

        System.out.print("Mais um kkk:");
        num3 = sc.nextInt();

        System.out.print("Agora o ultimo:");
        num4 = sc.nextInt();

        double dif = (num1 * num2) - (num3 * num4);

        System.out.println("Diferença: " + dif);

    }
}
