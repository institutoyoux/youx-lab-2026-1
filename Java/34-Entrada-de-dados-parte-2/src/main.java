import java.util.Scanner;

void main() {
//    Ler um texto ate a quebra de linha
//    Scanner sc = new Scanner(System.in);
//
//    String s1, s2, s3;
//
//    s1 = sc.nextLine();
//    s2 = sc.nextLine();
//    s3 = sc.nextLine();
//
//    System.out.println("Dados digitados:");
//    System.out.println(s1);
//    System.out.println(s2);
//    System.out.println(s3);
//
//    sc.close();

//    Atenção: quebra de linha pendente
    Scanner sc = new Scanner(System.in);

    int x;
    String s1, s2, s3;

    x = sc.nextInt();
    sc.nextLine(); // Solução
    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("Dados digitados:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    sc.close();
}