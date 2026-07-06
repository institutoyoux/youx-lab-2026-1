public class main {
    public static void main(String[] args) {
        canal();
        msg("João");
        System.out.println(somar(1,2,3,4));
    }

    public static void canal() {
        System.out.println("Hello world!");
    }
    public static void msg(String m) {
        System.out.printf("Olá %s!\n", m);
    }
    public static int somar(int... valor) {
        int resp=0;
        for (int n:valor) {
            resp += n;
        }
        return resp;
    }
}
