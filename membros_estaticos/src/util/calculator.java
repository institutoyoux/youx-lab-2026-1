package util;
import java.util.Locale;
import java.util.Scanner;
import util.calculator;

    public class calculator {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            calculator calc = new calculator();

            System.out.print("Enter Radius:");
            double radius = sc.nextDouble();
        }
    }