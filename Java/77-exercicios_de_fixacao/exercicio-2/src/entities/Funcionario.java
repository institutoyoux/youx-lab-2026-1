package entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;
    public double salario;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }
    public void salarioAumentado(double porcentagem) {
        salario = salarioLiquido() + (salarioLiquido() * porcentagem / 100);
    }
}
