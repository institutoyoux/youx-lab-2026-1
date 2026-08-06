package model.entities;

import model.enums.StatusPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    Integer id;
    Cliente cliente;
    List<Produto> produtos = new ArrayList<>();
    Endereco enderecoEntrega;
    StatusPedido status;

    public Pedido(Integer id, Cliente cliente, Endereco enderecoEntrega, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.status = status;
    }

    public Integer getId() {
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

    public void addProdutos(Produto produto) {
        produtos.add(produto);
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public double valorTotal() {
        double valor = 0;
        for (Produto p : produtos) {
            valor += p.getPreco();
        }
        return valor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append("\nID: " + id + ", ");
        sb.append("\nCliente: " + cliente.getNome());
        sb.append("\nProdutos:");
        for (Produto p : produtos) {
            sb.append("\n" + p.toString());
        }
        sb.append("\nEndereço: " + enderecoEntrega.toString());
        sb.append("\n" + status);
        sb.append("\n ");
        return sb.toString();
    }
}
