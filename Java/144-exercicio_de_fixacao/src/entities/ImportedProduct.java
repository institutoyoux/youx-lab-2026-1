package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct() {}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " " + String.format("$ %.2f", totalPrice());
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }
}
