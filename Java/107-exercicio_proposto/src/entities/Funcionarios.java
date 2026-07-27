package entities;

public class Funcionarios {

    private int id;
    private String nome;
    private double salario;

    public Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public double aumentoSalario(double porcentagem) {
        return salario += salario * porcentagem / 100;
    }

    @Override
    public String toString() {
        return id
                + ", "
                + nome
                + ", "
                + salario;
    }
}