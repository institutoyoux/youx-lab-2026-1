package s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao.entities;

public class OrderItem {
    private int quantity;
    private double price;
    private Product produto;

    public OrderItem(int quantity, double price, Product produto) {
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }
    public  double subTotal(){
       return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduto() {
        return produto;
    }

    public void setProduto(Product produto) {
        this.produto = produto;
    }
}
