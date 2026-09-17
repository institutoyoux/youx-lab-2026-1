import java.util.Scanner;
public class exercicio_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        double numero1 = sc.nextDouble();
        System.out.print("Digite outro número:");
        double numero2 = sc.nextDouble();

        double conta = numero1 + numero2;
        System.out.print("Resultado: " + conta);


    }
}
