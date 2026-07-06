public class main{
    public static void main(String[] args) {

        int num = 0;
        int n1=1,n2=2,n3=3;
        int res = n1+n2+n3;
        String nome = "João";
        num=50;

        System.out.print("oi"); // sem quebra de linha
        System.out.println("oi"); // print normal
        System.out.printf("oi %d, \nNome:%s\n", num, nome); // print com format
        System.out.printf("resultado soma: %d", res);
    }
}