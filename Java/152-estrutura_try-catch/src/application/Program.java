package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int positon = sc.nextInt();
            System.out.println(vect[positon]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        System.out.println("End of program");

        sc.close();
    }
}
