package s10_comportamento_de_memoria_arrays_listas.Vetor_exercicios.exercicio11_dados_pessoas;

public class pessoa {
    public double altura;
    public String genero;

    public pessoa(double altura, String genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
