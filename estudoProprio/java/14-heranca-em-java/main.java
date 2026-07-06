public class main {
    public static void main(String[] args) {
        Carro polo = new Carro("Polo 1.0 turbo 2024");
        CarroCombate c3 = new CarroCombate("Leopardo", 100);

        polo.info();
        System.out.println(" -----");
        c3.atirar();
        c3.atirar();
        c3.info();
    }
}
