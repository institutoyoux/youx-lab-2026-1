package entities;

public class Dados {

    private double altura;
    private char genero;

    public Dados(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public  void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }
}
