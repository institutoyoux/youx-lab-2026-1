package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.desafio_vetores;

public class cliente {
    public String nome;
    public String email;
    public int quarto;

    public cliente(String email, String nome, int quarto) {
        this.email = email;
        this.nome = nome;
        this.quarto = quarto;
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

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
}
