package s13_Herança_polimorfismo.metodos_Abstratos.exercicio02.entities;

public class Individual extends TaxPayer {
    private double healthexpenditures;

    public Individual(String name, Double anualcome, double healthexpenditures) {
        super(name, anualcome);
        this.healthexpenditures = healthexpenditures;
    }

    @Override
    public double tax() {
        double taxa = 0;
        double gasto = 0;
      if (getAnualIncome() < 20000)   {
         taxa += getAnualIncome() * 15/100;
      }
      else if ( getAnualIncome() >= 20000) {
          taxa += getAnualIncome() * 25/100;
      }
      if (healthexpenditures > 0) {
          gasto =healthexpenditures * 50/100;
      }
      return taxa - gasto;
    }

}
