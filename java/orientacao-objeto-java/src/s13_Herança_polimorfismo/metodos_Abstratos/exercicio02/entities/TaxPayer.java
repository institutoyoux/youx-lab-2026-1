package s13_Herança_polimorfismo.metodos_Abstratos.exercicio02.entities;

public abstract class TaxPayer {
    private String name;
    private Double anualIncome;


    public abstract double tax() ;


    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualcome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
}
