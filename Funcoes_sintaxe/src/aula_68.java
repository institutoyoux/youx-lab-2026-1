import java.util.Scanner;

public class aula_68 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }
        sc.close();
    }
}
