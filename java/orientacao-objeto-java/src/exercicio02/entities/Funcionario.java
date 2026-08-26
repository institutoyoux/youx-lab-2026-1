package exercicio02.entities;

public class Funcionario {
    public String name;
    public double salario;
    public double taxa;

    public double salarioLiquido() {
        return salario - taxa;
    }
    public void aumentoSalario(double porcentagem) {
        salario = salario + (salario * (1 + porcentagem/100 ));
    }
    public String toString() {
        return name + ", " + "$ " + salario;

    }
}
