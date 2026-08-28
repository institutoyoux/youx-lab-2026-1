package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle2;
public class Rectangle1 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle2 rectangle = new Rectangle2();
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();
        System.out.println(rectangle);
        sc.close();
    }
}