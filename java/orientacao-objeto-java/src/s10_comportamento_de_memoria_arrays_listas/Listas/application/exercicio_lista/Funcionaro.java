package s10_comportamento_de_memoria_arrays_listas.Listas.application.exercicio_lista;

public class Funcionaro {
    public int id;
    public String nome;
    public  double Salary;

    public Funcionaro(int id, String nome, double salary) {
        this.id = id;
        this.nome = nome;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double aumentoSalario(double conta) {
        return Salary = Salary + Salary * conta /100;
    }
}
