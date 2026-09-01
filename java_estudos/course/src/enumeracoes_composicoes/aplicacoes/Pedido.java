package enumeracoes_composicoes.aplicacoes;
import enumeracoes_composicoes.entities.*;
import enumeracoes_composicoes.entities.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Pedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente: ");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de Nascimento (DD/MM/AAAA): ");
        String dataTexto = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataTexto,fmt);
        sc.nextLine();

        Cliente cliente = new Cliente(name,email,dataNascimento);

        System.out.println("Entre com o status do pedido: ");
        String status1 = sc.nextLine();
        OrderStatus statusDoPedido = OrderStatus.valueOf(status1);

        Order order = new Order(LocalDateTime.now(),statusDoPedido,cliente);


        System.out.println("Quantos itens esse pedido possui? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<n ; i++) {
            System.out.println("Entre com o #"+(i+1)+ " item: ");

            System.out.println("Nome do produto: ");
            String nome = sc.nextLine();

            System.out.println("Preco do produto: ");
            Double preco = sc.nextDouble();

            System.out.println("Quantidade: ");
            Integer quantidade = sc.nextInt();

            sc.nextLine();

            Produto produto = new Produto(nome,preco);
            OrderItem orderItem = new OrderItem(quantidade,produto);

            order.addItens(orderItem);
        }




        System.out.println(order);




    }
}
