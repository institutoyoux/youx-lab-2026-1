import java.util.Scanner;
import java.util.Locale;

public class est_condicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hora;
        System.out.println("Quantas Horas?");
        hora = sc.nextInt();


        if (hora < 12) {
            System.out.println("Bom Dia");
        }
        else if (hora < 18) {
            System.out.println("Boa Tarde");
        }
        else {
            System.out.println("Boa Noite");
        }


        sc.close();
    }
}