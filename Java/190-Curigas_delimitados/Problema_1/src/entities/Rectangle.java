package entities;

public class Rectangle implements Shape {

    private Double width;
    private Double hight;

    public Rectangle(Double width, Double hight) {
        this.width = width;
        this.hight = hight;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHight() {
        return hight;
    }

    public void setHight(Double hight) {
        this.hight = hight;
    }

    @Override
    public double area() {
        return width * hight;
    }
}
