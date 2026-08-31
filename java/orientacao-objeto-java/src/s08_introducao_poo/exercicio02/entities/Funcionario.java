package s08_introducao_poo.exercicio02.entities;

public class Funcionario {
    public String name;
    public double salario;
    public double taxa;

    public double salarioLiquido() {
        return salario - taxa;
    }
    public void aumentoSalario(double porcentagem) {
        salario = salario + (salario * ( porcentagem/100 ));
    }
    public String toString() {
        return name + ", " + "$ " + salarioLiquido();

    }
}
