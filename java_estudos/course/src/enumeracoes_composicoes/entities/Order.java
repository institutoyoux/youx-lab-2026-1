package enumeracoes_composicoes.entities;

import enumeracoes_composicoes.entities.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime momento;
    private OrderStatus status;
    private Cliente cliente;


    public Order(LocalDateTime momento, OrderStatus status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    List<OrderItem> itens = new ArrayList<>();

    public void addItens(OrderItem item) {itens.add(item);}

    public void removeItens(OrderItem item) {itens.remove(item);}

    public Double total() {
        double soma = 0;
        for (OrderItem i: itens) {
            soma += i.subTotal();
        }
        return soma;
    }



    public String toString() {
        java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("SUMARIO DOS PEDIDOS: ").append("\n");
        sb.append("Momento do pedido: ").append(momento.format(fmt)).append("\n");
        sb.append("Status do pedido: ").append(status).append("\n");
        sb.append("Cliente: ").append(cliente.getName()).append(" ").append(cliente.getDataNascimento()).append(" - ").append(cliente.getEmail()).append("\n");
        sb.append("Itens dos pedidos: ").append("\n");
        for (OrderItem i: itens) {
            sb.append(i).append("\n");
        }
        sb.append("Preco total: ").append(total());

        return sb.toString();
        }

}
