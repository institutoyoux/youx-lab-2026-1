package entities;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    Set<Endereco> enderecos = new HashSet<>();

    public Cliente() {
    }
    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }
    public Endereco getEnderecoById(int id) {
        for (Endereco endereco : enderecos) {
            if (endereco.getId() == id) {
                return endereco;
            }
        }
        throw new IllegalArgumentException("Erro: nenhum produto encontrado");
    }
}
