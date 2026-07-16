package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double area = rectangle.area(width, height);
        System.out.println("AREA = " + area);
        double perimeter = rectangle.perimeter(width, height);
        System.out.println("PERIMETER = " + perimeter);
        double diagonal = rectangle.diagonal(width, height);
        System.out.println("DIAGONAL = " + diagonal);
    }
}
