import entities.Order;
import entities.enums.OrderStatus;
import java.util.Date;

public class Testes {
    public static void main(String[] args) {
        Order order = new Order(1000, new Date(), OrderStatus.PROCESSING);
        System.out.print(order);
    }
}