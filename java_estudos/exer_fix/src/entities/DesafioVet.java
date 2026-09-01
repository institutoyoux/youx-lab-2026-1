package entities;

public class DesafioVet {
    private String nome;
    private int numero;
    private String email;

    public DesafioVet(String nome, String email, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public String infos(){
        return this.numero + ": " + this.nome + ", " + this.email;
    }
}


