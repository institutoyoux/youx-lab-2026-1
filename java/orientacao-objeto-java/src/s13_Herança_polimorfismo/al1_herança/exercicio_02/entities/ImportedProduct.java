package s13_Herança_polimorfismo.al1_herança.exercicio_02.entities;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct() {
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
}


