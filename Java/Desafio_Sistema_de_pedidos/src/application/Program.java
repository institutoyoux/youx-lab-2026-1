package application;

import model.entities.Cliente;
import model.entities.Endereco;
import model.entities.Pedido;
import model.entities.Produto;
import model.enums.StatusPedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    static void main() {

        List<Pedido> pedidos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Cliente c1 = new Cliente(1,"Luiz", "luiz@gmail.com");
        Cliente c2 = new Cliente(2, "Breno", "breno@gmail.com");
        Cliente c3 = new Cliente(3, "Ana", "ana@gmail.com");
        Cliente c4 = new Cliente(4, "Maria", "maria@gmail.com");
        Cliente c5 = new Cliente(5, "João", "joao@gmail.com");

        Produto p1 = new Produto(1, "Smartwatch", 700.0);
        Produto p2 = new Produto(2, "Xiaomi Redmi 15", 2000.0);
        Produto p3 = new Produto(3, "PC Gamer", 8000.0);
        Produto p4 = new Produto(4, "PlayStation 5", 3500.0);
        Produto p5 = new Produto(5, "Xbox Series X", 3750.0);
        Produto p6 = new Produto(6, "Samsung Galaxy S25", 3800.0);

        Endereco e1 = new Endereco("Rua Francisco Sales", "120", "Lavras", "Minas Gerais");
        Endereco e2 = new Endereco("Rua Orlando Ribeiro", "155", "Campo Belo", "Minas Gerais");
        Endereco e3 = new Endereco("Rua dos Limoeiros", "280", "São Paulo", "São Paulo");

        Pedido pdd1 = new Pedido(1, c1, e1, StatusPedido.ENTREGUE);
        pdd1.addProdutos(p1);
        pdd1.addProdutos(p5);
        pdd1.addProdutos(p6);

        Pedido pdd2 = new Pedido(2, c2, e1, StatusPedido.EM_ANDAMENTO);
        pdd2.addProdutos(p2);

        Pedido pdd3 = new Pedido(3, c3, e2, StatusPedido.AGUARDANDO_ENVIO);
        pdd3.addProdutos(p5);
        pdd3.addProdutos(p3);

        Pedido pdd4 = new Pedido(4, c4, e3, StatusPedido.ATRASADO);
        pdd4.addProdutos(p4);

        Pedido pdd5 = new Pedido(5, c5, e2, StatusPedido.ENTREGUE);
        pdd5.addProdutos(p3);
        pdd5.addProdutos(p1);

        pedidos.add(pdd1);
        pedidos.add(pdd2);
        pedidos.add(pdd3);
        pedidos.add(pdd4);
        pedidos.add(pdd5);

        int resposta;
        int id;

        do {
            System.out.println("""
                    1: Buscar pedido por ID
                    2: Valor do pedido
                    3: Status do pedido
                    4: Sair""");

            System.out.println();
            System.out.println("Comando: ");
            resposta= sc.nextInt();

            switch (resposta) {
                case 1:
                    System.out.print("ID do pedido: ");
                    id = sc.nextInt();
                    for (Pedido pdd: pedidos) {
                        if (pdd.getId() == id) {
                            System.out.println(pdd.toString());
                        }
                    }
                    break;

                case 2:
                    System.out.print("ID do pedido: ");
                    id = sc.nextInt();
                    for (Pedido pdd : pedidos) {
                        if (pdd.getId() == id) {
                            System.out.println();
                            System.out.println("Valor do pedido " + id + ": " + pdd.valorTotal());
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("ID do pedido: ");
                    id = sc.nextInt();
                    for (Pedido pdd : pedidos) {
                        if (pdd.getId() == id) {
                            System.out.println();
                            System.out.println("Status: " + pdd.getStatus());
                            System.out.println();
                        }
                    }

                default:
                    break;
            }
        } while (resposta != 4);

        sc.close();
    }
}
