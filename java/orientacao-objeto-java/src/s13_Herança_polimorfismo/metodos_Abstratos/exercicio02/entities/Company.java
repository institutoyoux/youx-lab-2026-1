package s13_Herança_polimorfismo.metodos_Abstratos.exercicio02.entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company(String name, Double anualcome, int numberOfEmployees) {
        super(name, anualcome);
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    public double tax() {

        if (numberOfEmployees > 10) {
            return getAnualIncome() * 14/100;
        }
        else {
            return getAnualIncome() * 16/100;
        }
    }
}
