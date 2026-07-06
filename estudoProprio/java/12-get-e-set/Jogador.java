public class Jogador {
    private int gols = 2;

    public Jogador(int num) {
        System.out.println("Jogador criado!");
    }
    public int getGols() {
        return this.gols;
    }
    public void setGols(int gols) {
        this.gols = gols;
    }
}
