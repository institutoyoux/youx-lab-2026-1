package entities;

public class ImportedProduct extends Product {
    private Double customsFee;
    public ImportedProduct() {
        super();
    }
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
    public Double totalPrice() {
        return super.getPrice() + this.customsFee;
    }
    @Override
    public String priceTag() {
        return super.getName() + " R$ " + this.totalPrice() + " (Customs fee: R$ " + this.customsFee + ")";
    }
}
