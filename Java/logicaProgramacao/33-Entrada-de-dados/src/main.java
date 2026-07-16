import java.util.Scanner;
import java.util.Locale;

void main () {
//    Ler uma palavra
//    Scanner sc = new Scanner(System.in);
//
//    String x;
//
//    x = sc.next();
//
//    System.out.println("Você digitou: " + x);
//
//
//    sc.close();

//    Ler um numero interio
//    Scanner sc = new Scanner(System.in);
//
//    int x;
//
//    x = sc.nextInt();
//
//    System.out.println("Você digitou: " + x);
//
//
//    sc.close();

//    Ler um numero flutuante
//    Scanner sc = new Scanner(System.in);
//
//    double x;
//
//    x = sc.nextDouble();
//
//    System.out.println("Você digitou: " + x);
//    System.out.printf("Voce digitou: %.2f %n", x);
//
//    sc.close();

//    Exemplo com lovale
//
//    Locale.setDefault(Locale.US);
//    Scanner sc = new Scanner(System.in);
//
//    double x;
//
//    x = sc.nextDouble();
//
//    System.out.printf("Você digitou: %.2f%n", x);
//
//    sc.close();

//    Ler um caractere (char)
//    Scanner sc = new Scanner(System.in);
//
//    char x;
//
//    x = sc.next().charAt(0);
//
//    System.out.println("Você digitou: " + x);
//
//    sc.close();

//    Ler varios dados na mesma linha
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String x;
    int y;
    double z;

    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble();

    System.out.println("Dados digitados:");
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    sc.close();
}