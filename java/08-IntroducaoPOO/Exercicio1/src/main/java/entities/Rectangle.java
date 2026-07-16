package entities;

public class Rectangle {
    public Double width;
    public Double height;

    public Double area(double width, double height) {
        return width * height;
    }
    public Double perimeter(double width, double height) {
        return (width * 2) + (height * 2);
    }
    public Double diagonal(double width, double height) {
        return Math.sqrt(width * width + height * height);
    }
}
