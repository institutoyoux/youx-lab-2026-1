package GenericSetMap.entities;

import java.util.Objects;

public class Eleicao {
    private String nome;
    private Integer numero;

    public Eleicao(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Eleicao eleicao = (Eleicao) o;
        return Objects.equals(nome, eleicao.nome) && Objects.equals(numero, eleicao.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}
