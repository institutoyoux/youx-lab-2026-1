package exercicio01.entities;

public class Retangulo {
    public double largura;
    public double altura;

    public double valorArea() {
        return largura * altura;
    }
    public double perimetroRetangulo() {
        return 2 * (altura + largura);
    }
    public double diagonalRetangulo() {
        return Math.sqrt( Math.pow(altura,2) + Math.pow(largura,2));

    }
































































































}
