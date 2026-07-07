package entities;

public class Funcionario {
    private int id;
    private String name;
    private Double salary;
    public Funcionario(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return this.id;
    }
    public void reajust(Double percent) {
        if (this.salary > 0) {
            this.salary = salary * (1 + (percent / 100));
        }
    }
    public void info() {
        System.out.printf("%d, %s, %.2f \n",this.id, this.name, this.salary);
    }
}
