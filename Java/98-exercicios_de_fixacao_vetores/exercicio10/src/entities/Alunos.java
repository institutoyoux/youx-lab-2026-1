package entities;

public class Alunos {

    private String nome;
    private double semestre1;
    private double semestre2;

    public Alunos(String nome, double semestre1, double semestre2) {
        this.nome = nome;
        this.semestre1 = semestre1;
        this.semestre2 = semestre2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSemestre1(double semestre1) {
        this.semestre1 = semestre1;
    }

    public double getSemestre1() {
        return semestre1;
    }

    public void setSemestre2(double semestre2) {
        this.semestre2 = semestre2;
    }

    public double getSemestre2() {
        return semestre2;
    }
}
