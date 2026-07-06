public class main {
    public static void main(String[] args) {
        int num = 0;
        Jogador j1 = new Jogador(3, ++num);
        Jogador j2 = new Jogador(0, ++num);
        j1.info();
        j2.info();
        System.out.println(Jogador.qtd);
    }
}
