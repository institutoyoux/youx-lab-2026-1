import java.util.Locale;
import java.util.Scanner;

public class exercicio_6 {

    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float area = (A * C) / 2;
        System.out.println("Triangulo: " + area);
        System.out.println("Circulo: " + (C * C) * 3.14159);
        System.out.println("Trapézio: " + (A + B) * C / 2);
        System.out.println("Quadrado: " + B * B);
        System.out.println("Retângulo :" + A * B);
    }
}
