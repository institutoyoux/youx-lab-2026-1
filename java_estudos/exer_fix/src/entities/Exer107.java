package entities;

public class Exer107 {
    private int id;
    private String nome;
    private double salario;

    public Exer107(int id, String nome,double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentoSalario(double porcentagem) {
        salario = salario + (salario * (porcentagem / 100));
    }

    public int getId() {
        return id;
    }

    public String infos() {
        return this.id + "," + this.nome + "," + this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

}


