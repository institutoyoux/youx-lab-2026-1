package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

    private Client client;
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> itens = new ArrayList<>();

    public Order() {}

    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public double total() {
        double sum =0;
        for (OrderItem i: itens) {
            sum += i.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data do pedido: " + sdf2.format(moment) + "\n");
        sb.append("Status: " + status +"\n");
        sb.append("Cliente: " + client.toString() + "\n");
        sb.append("Itens do pedido: \n");
        for (OrderItem i : itens) {
            sb.append(i.getProduct().getName() + ", $" + String.format("%.2f", i.getPrice()) + ", Quantity: " + i.getQuantity() + ", Subtotal: $" + String.format("%.2f", i.subTotal()) + "\n");
        }
        sb.append("Valor total: " + String.format("$%.2f", total()));
        return sb.toString();
    }
}
