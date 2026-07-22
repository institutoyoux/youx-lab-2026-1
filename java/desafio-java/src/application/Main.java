package application;

import entities.Cliente;
import entities.Endereco;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(0, "Lucas", "lucas@email.com");
        Cliente c2 = new Cliente(1, "Alex", "alex@email.com");
        Cliente c3 = new Cliente(2, "Carlos", "carlos@email.com");
        Cliente c4 = new Cliente(3, "Caio", "caio@email.com");
        Cliente c5 = new Cliente(4, "Vinicius", "vinicius@email.com");


        Endereco e1 = new Endereco(0, "Centro", 10, "Lavras", "Mg");
        c1.addEndereco(e1);
        c2.addEndereco(e1);
        c3.addEndereco(e1);
        c4.addEndereco(e1);
        c5.addEndereco(e1);
        // todos moram em um apartamento kkkk

        Produto p1 = new Produto(0, "notebook", 3000.0);
        Produto p2 = new Produto(1, "celular", 500.0);
        Produto p3 = new Produto(2, "cafeteira", 200);
        Produto p4 = new Produto(3, "luva boxe", 300.0);
        Produto p5 = new Produto(4, "torneira", 80.0);
        Produto p6 = new Produto(5, "chuveiro", 200.0);
        List<Produto> produtos = Arrays.asList(p1, p2,p3,p4,p5,p6);

        Pedido pe1 = new Pedido(0, produtos, c1, e1.getId(), StatusPedido.ATRASADO);
        Pedido pe2 = new Pedido(1, produtos, c2, e1.getId(), StatusPedido.AGUARDANDO_ENVIO);
        List<Pedido> pedidos = Arrays.asList(pe1, pe2);

        Scanner input = new Scanner(System.in);
        int opt = 0;
        while (opt != 4) {
            menu();
            opt = input.nextInt();
            if (opt == 1) {
                System.out.print("Digite o id: ");
                int id = input.nextInt();
                try {
                    boolean erro = true;
                    for (Pedido pedido : pedidos) {
                        if (pedido.getId() == id) {
                            System.out.println(pedido);
                            erro = false;
                        }
                    }
                    if (erro) {
                        throw new IllegalArgumentException("Nenhum produto encontrado!");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (opt == 2) {
                System.out.print("Digite o id: ");
                int id = input.nextInt();
                for (Pedido pedido : pedidos) {
                    if (pedido.getId() == id) {
                        System.out.println("O total do pedido é: " + pedido.valorTotal());
                    }
                }
            }
            if (opt == 3) {
                System.out.print("Digite o status: ");
                String status = input.next();
                List<Pedido> pedidos1 = new ArrayList<>();
                for (Pedido pedido : pedidos) {
                    if (pedido.getStatus() == StatusPedido.valueOf(status)) {
                        pedidos1.add(pedido);
                    }
                }
                for (Pedido pedido : pedidos1) {
                    System.out.println(pedido);
                }
            }
        }
    }
    private static void menu() {
        System.out.println("1- Buscar pedido por id\n2- Valor total por id\n3- Pedidos por status\n4- Sair");
        System.out.print("Digite sua opção: ");
    }
}
