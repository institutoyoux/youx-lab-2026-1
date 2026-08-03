package entities;

import enums.StatusPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<Produto>();
    private Endereco enderecoEntrega;
    public StatusPedido status;

    public Pedido() {
    }

    public Pedido(int id,
                  Cliente cliente,
                  List<Produto> produtos,
                  Endereco enderecoEntrega,
                  StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
        this.enderecoEntrega = enderecoEntrega;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removeProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double valorTotal() {
        double vlrTotal = 0;
        for (Produto p : produtos) {
            vlrTotal += p.getPreco();
        }
        return vlrTotal;
    }

    @Override
    public String toString() {
        return "Id: " +
                getId() +
                " | Cliente: " +
                getCliente() +
                " | Produtos: " +
                getProdutos() +
                " | Endereço: " +
                getEnderecoEntrega() +
                " | Status do pedido: " +
                getStatus();
    }
}
