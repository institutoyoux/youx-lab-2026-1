package entities;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;


    public double salario_liquido() {
        return salario - imposto;
    }

    public void salario_aumentado(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    public String toString(){
        return nome + " , $ " + String.format("%.2f",salario_liquido());
    }
}