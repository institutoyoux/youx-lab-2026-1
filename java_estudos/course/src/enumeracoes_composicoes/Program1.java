package enumeracoes_composicoes;

import entities.Order;
import entities_enums.OrderStatus;

import java.util.Date;

public class Program1 {
    public static void main(String[] args) {
        Order order = new Order(OrderStatus.PENDING_PAYMENT,new Date(), 1080);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);


    }
}