import java.util.Scanner;
public class Testes {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);
        int num = teste.nextInt();
        for(int i=1; i<= num; i+=2){
            System.out.print("Valor de 1: %d%n".formatted(i));
        }
    }
}
