package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio10_aprovados;

public class Alunos {
    public String name;
    public double nota1;
    public double nota2;


    public Alunos(double nota1, String name, double nota2) {
        this.nota1 = nota1;
        this.name = name;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

}
