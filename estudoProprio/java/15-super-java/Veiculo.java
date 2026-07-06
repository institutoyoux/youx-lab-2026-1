public class Veiculo {
    private String nome;
    private int tipo;
    public Veiculo(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    public void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
    }
}