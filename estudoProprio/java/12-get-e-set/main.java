public class main {
    public static void main(String[] args) {
        Jogador atleta = new Jogador(1);
        System.out.println(atleta.getGols());
        atleta.setGols(5);
        System.out.println(atleta.getGols());
    }
}