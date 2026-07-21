package entities;

import entities.enums.StatusPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();
    private int idEndereco;
    private StatusPedido status;

    public Pedido(int id, List<Produto> produtos, Cliente cliente, int idEndereco, StatusPedido status) {
        this.id = id;
        this.produtos = produtos;
        this.cliente = cliente;
        this.idEndereco = idEndereco;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Double valorTotal() {
        double sum = 0;
        for (Produto produto : produtos) {
            sum += produto.getValor();
        }
        return sum;
    }
    @Override
    public String toString() {
        return String.format("Id: %s, Cliente: %s", getId(), getCliente().getNome());
    }
}
