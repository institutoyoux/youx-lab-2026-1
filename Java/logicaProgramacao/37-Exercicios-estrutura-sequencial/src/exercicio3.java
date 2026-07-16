import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int a, b, c, d, diferenca;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    diferenca = a * b - c * d;

    System.out.println("Diferença: " + diferenca);
    }