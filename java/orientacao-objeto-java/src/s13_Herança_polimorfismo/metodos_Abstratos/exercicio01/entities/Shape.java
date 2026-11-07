package s13_Herança_polimorfismo.metodos_Abstratos.exercicio01.entities;

import java.awt.*;

public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract double area();
}
