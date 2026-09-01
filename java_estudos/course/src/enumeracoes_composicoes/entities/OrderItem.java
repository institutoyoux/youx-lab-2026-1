package enumeracoes_composicoes.entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantidade;

    public Produto produto;

    public OrderItem(Integer quantidade,Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }


    public Double subTotal() {
        double soma;
        soma = produto.getPreco() * quantidade;
        return soma;
    }

    public String toString() {
        return produto.getNome()
                + ", R$ "
                + String.format("%.2f", produto.getPreco())
                + ", Quantidade: "
                + quantidade
                ;
    }


}
