public class Jogador {
    private int gols = 0;
    private int total = 0;
    static int qtd = 0;

    public Jogador(int gols, int nums) {
        this.total = nums;
        this.gols = gols;
        qtd++;
        System.out.printf("%d° Jogador criado com sucesso!\n", this.total);
    }
    public  void info() {
        System.out.printf("Esse jogador tem, %d gols\n", gols);
    }
}
