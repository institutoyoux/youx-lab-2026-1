package application;

import entities.Cliente;
import entities.Endereco;
import entities.Produto;
import entities.Pedido;
import enums.StatusPedido;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente c1 = new Cliente(1, "Artur", "artur@youx.com");
        Cliente c2 = new Cliente(2, "João Manoel", "jaoManoel@youx.com");
        Cliente c3 = new Cliente(3, "Luiz", "luizManteiga@youx.com");
        Cliente c4 = new Cliente(4, "Beatriz", "biaSocorro@youx.com");
        Cliente c5 = new Cliente(5, "Maria Fernanda", "mariaFernanda@youx.com");

        Produto p1 = new Produto(1, "Notebook", 4000.00);
        Produto p2 = new Produto(2, "Teclado", 170.00);
        Produto p3 = new Produto(3, "Mouse", 120.00);
        Produto p4 = new Produto(4, "Fone", 117.00);
        Produto p5 = new Produto(5, "Caneca", 30.00);
        Produto p6 = new Produto(6, "Pacote Bolacha", 9.80);
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Endereco end1 = new Endereco("Rua Dr. Sebastião", "777", "Lavras", "MG");
        Endereco end2 = new Endereco("Rua Padre Dehon", "11", "Lavras", "MG");

        Pedido pdd1 = new Pedido(1, c1, Arrays.asList(p2, p5), end1, StatusPedido.ENTREGUE);
        Pedido pdd2 = new Pedido(2, c2, List.of(p6), end2, StatusPedido.ATRASADO);
        Pedido pdd3 = new Pedido(3, c3, produtos, end1, StatusPedido.AGUARDANDO_ENVIO);
        Pedido pdd4 = new Pedido(4, c4, Arrays.asList(p6, p4), end2, StatusPedido.EM_ANDAMENTO);
        Pedido pdd5 = new Pedido(5, c5, List.of(p2), end2, StatusPedido.ATRASADO);

        List<Pedido> pedidos = Arrays.asList(pdd1, pdd2,  pdd3, pdd4, pdd5);

        int op = 0;
        while (op != 4) {
            System.out.println("Olá, selecione uma das opções:\n1- Buscar pedido por ID\n2- Ver o valor total de um pedido por ID\n3- Buscar pedidos por status\n4- Sair");
            System.out.print("Qual sua opção? ");
            op = sc.nextInt();
            if (op == 1) {
                System.out.print("Qual o id do pedido? ");
                int idBusca = sc.nextInt();
                for (Pedido p : pedidos) {
                    if (p.getId() == idBusca) {
                        System.out.println(p);
                    }
                }

            }
            if (op == 2) {
                System.out.print("Qual o id do pedido? ");
                int idBusca = sc.nextInt();
                for (Pedido p : pedidos) {
                    if (p.getId() == idBusca) {
                        System.out.println(p.valorTotal());
                    }
                }
            }
            if (op == 3) {
                System.out.print("Qual o Status do pedido? ");
                StatusPedido stPdd = StatusPedido.valueOf(sc.next());
                for (Pedido p : pedidos) {
                    if (p.getStatus().equals(stPdd)) {
                        System.out.println(p);
                    }
                }
            }
        }
    }
}
