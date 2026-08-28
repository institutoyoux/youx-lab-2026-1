package entities;
public class Employee2 {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return this.grossSalary - this.tax;
    }
    public void increaseSalary(double percentage){
        this.grossSalary += grossSalary * (percentage * 0.01);
    }
}
