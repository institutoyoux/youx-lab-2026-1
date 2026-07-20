package entities;

public class Estudante {

    public String nome;
    public double trimestre1, trimestre2, trimestre3;

    public double notaFinal() {
        double total = trimestre1 + trimestre2 + trimestre3;
        return total;
    }
}
