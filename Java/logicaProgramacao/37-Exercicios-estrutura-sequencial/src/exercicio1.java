import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int a, b, soma;

    System.out.println("Digite um numero:");
    a = sc.nextInt();
    System.out.println("Digite outro numero:");
    b = sc.nextInt();

    soma = a + b;

    System.out.println("Soma = " + soma);
    sc.close();
}