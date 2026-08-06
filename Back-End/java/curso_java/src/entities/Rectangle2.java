package entities;
public class Rectangle2 {

    public double weight;
    public double height;

    public double area(){
        return weight * height;
    }
    public double perimeter(){
        return (weight * 2) + (height * 2);
    }
    public double diagonal(){
        return Math.sqrt((weight * weight) + (height * height));
    }
    public String toString(){
        return String.format("Area: %.2f",area())+String.format("Perimeter: %.2f",area())+String.format("Diagonal: %.2f",area());
    }
}
