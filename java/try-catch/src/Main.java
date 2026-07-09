import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("Fim do programa!");
    }

    public static void method1() {
        System.out.println("Inicio method 1");
        method2();
        System.out.println("Fim method 1");

    }

    public static void method2() {
        System.out.println("Inicio method 2");
        Scanner input = new Scanner(System.in);
        try {
            String[] names = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(names[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida!");
            e.printStackTrace();
            input.next();
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada invalida");
        }
        System.out.println("Fim method 2");
    }
}