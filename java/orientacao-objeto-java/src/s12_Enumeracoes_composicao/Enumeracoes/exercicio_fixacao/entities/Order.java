package s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao.entities;

import s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao.entities.enums.OrdesStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrdesStatus status;
   private List<OrderItem> orderItems = new ArrayList<>();
   private Client cliente;

   public Order(){
   }

   public void addItem(OrderItem orderItem){
       orderItems.add(orderItem);
   }
    public void removeItem(OrderItem orderItem){
       orderItems.remove(orderItem);
    }
    public Double total(){
      double total = 0;
      for (OrderItem orderItem:orderItems){
          total += orderItem.subTotal();
      }
      return total;
    }

    public Order( Client cliente, OrdesStatus status) {
        this.cliente = cliente;
        this.status = status;
    }

    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Order moment: " + moment + "\n");
       sb.append( "Order status: " + status + "\n");
       sb.append("Client: " + cliente + "\n");
       sb.append("Order items: \n");
       for(OrderItem orderItem: orderItems) {
           sb.append(orderItem.getProduto().getName() + "  " + orderItem.getPrice() + orderItem.getQuantity() + orderItem.subTotal());

       }
       sb.append(total());
       return sb.toString();





    }
}
