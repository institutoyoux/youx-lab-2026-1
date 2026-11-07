package s12_Enumeracoes_composicao.Enumeracoes.application;


import s12_Enumeracoes_composicao.Enumeracoes.entities.Pedidos;
import s12_Enumeracoes_composicao.Enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Pedidos pedido = new Pedidos(1080,new Date(), OrderStatus.PENDING_PAYMENT );

        System.out.println(pedido);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
