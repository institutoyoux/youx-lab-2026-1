package application;
import entities.Triangle2;

import java.util.Locale;
import java.util.Scanner;

public class Triangle1 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle2 x,y;
        x = new Triangle2();
        y = new Triangle2();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b= sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();


        double areaY = y.area();

        System.out.print("Triangle X area: %.4f%n".formatted(areaX));
        System.out.print("Triangle Y area: %.4f%n".formatted(areaY));

        if (areaX > areaY){
            System.out.print("Larger area: X");
        }
        else {
            System.out.print("Larger area: Y");
        }














        sc.close();
    }
}








































































