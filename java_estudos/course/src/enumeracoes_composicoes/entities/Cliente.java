package enumeracoes_composicoes.entities;

import java.time.LocalDate;

public class Cliente {

    private String name;
    private String email;
    private LocalDate dataNascimento;

    public Cliente() {

    }

    public Cliente(String name, String email, LocalDate dataNascimento) {
        this.name = name;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}


