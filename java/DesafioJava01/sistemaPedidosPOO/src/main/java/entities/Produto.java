package entities;

public class Produto {
    private int id;
    public String nome;
    public double preco;

    public Produto() {
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "id: " +
                id +
                ", nome: " +
                nome +
                ", preco: " +
                preco +
                " | ";
    }
}
