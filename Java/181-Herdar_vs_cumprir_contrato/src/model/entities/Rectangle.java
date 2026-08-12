package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {

    private Double width;
    private Double hight;

    public Rectangle(Color color, Double width, Double hight) {
        super(color);
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
