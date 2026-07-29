package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        Scanner sc = new Scanner(System.in);

        Order pedido = new Order();
        Product produto = new Product();
        OrderItem item = new OrderItem();

        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date dataNascimento = sdf.parse(sc.next());
        Client cliente = new Client(nome, email, dataNascimento);

        System.out.println("Digite os dados do pedido:");
        System.out.print("Status: ");
        sc.nextLine();
        pedido = new Order(OrderStatus.valueOf(sc.nextLine()), cliente);

        System.out.println();
        System.out.print("Quantos itens terá no pedido? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do " + (i+1) + "° produto:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            produto = new Product(nomeProduto, preco);
            item = new OrderItem(produto, quantidade, preco);
            pedido.addItem(item);
        }

        System.out.println();
        System.out.println("Sumario do pedido:");
        System.out.println(pedido.toString());

        sc.close();
    }
}