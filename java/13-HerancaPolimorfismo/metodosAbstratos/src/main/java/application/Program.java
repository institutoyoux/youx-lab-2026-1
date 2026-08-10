package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            String op = sc.next();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();
            switch (op) {
                case "r":
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();
                    list.add(new Rectangle(Color.valueOf(color),  width, height));
                    break;

                case "c":
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();
                    list.add(new Circle(Color.valueOf(color), radius));
                    break;
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape s : list) {
            System.out.printf("%.2f\n", s.area());
        }
    }
}
