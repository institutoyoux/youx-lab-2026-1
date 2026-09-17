import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Digite o raio: ");
        double numero1 = sc.nextDouble();
        double power = Math.pow(numero1, 2);
        double area = pi * power;
        System.out.printf("Resultado %.4f",area);

    }
}
