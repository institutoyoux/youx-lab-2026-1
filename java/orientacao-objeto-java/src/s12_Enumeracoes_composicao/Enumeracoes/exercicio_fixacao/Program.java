package s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao;

import s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao.entities.Client;
import s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao.entities.Order;
import s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao.entities.OrderItem;
import s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao.entities.Product;
import s12_Enumeracoes_composicao.Enumeracoes.exercicio_fixacao.entities.enums.OrdesStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Order order = new Order();
        System.out.println("Enter cliente data: ");
        System.out.println("Name: ");
        String nome = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date data = sdf.parse(sc.next());
        Client cliente = new Client(email,nome,data);
        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        String status = sc.nextLine();
        System.out.println("How many items to this order? ");
        int numero = sc.nextInt();
        for (int i = 0; i < numero; i++) {
            System.out.println("Enter #1 item data: ");
            System.out.println("product name: " );
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Product price: ");
            double price = sc.nextDouble();
            System.out.println("quantity: ");
            int qnt = sc.nextInt();
            Product produto = new Product(nome,price);
            OrderItem orderItem = new OrderItem(qnt,price, produto);
            order = new Order(cliente, OrdesStatus.valueOf(status));
            order.addItem(orderItem);
        }
        System.out.println(order.toString());


        }

}
