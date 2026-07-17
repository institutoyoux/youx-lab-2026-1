package entities;

public class Reajuste {
    public String name = " ";
    public double salary = 0;
    public double tax = 0;
    public double percentage = 0;

    public double NetSalary(double salary, double tax) {
        return salary - tax;
    }
    public double IncreaseSalary(double netSalary, double percentage) {
        return netSalary * (percentage / 100 + 1);
    }
}
