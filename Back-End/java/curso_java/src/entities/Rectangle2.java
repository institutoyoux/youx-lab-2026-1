package entities;
public class Rectangle2 {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return (width * 2) + (height * 2);
    }
    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }
    public String toString(){
        return String.format("Area: %.2f",area())+String.format("\nPerimeter: %.2f",perimeter())+String.format("\nDiagonal: %.2f",diagonal());
    }
}
