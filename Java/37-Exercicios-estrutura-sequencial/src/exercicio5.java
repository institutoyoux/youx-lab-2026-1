import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int codigo1, codigo2, quantidade1, quantidade2;
    double valor1, valor2, total;

    System.out.println("Codido peça 1:");
    codigo1 = sc.nextInt();
    System.out.println("Quantidade peça 1:");
    quantidade1 = sc.nextInt();
    System.out.println("Valor da peça 1:");
    valor1 = sc.nextDouble();

    System.out.println("Codido peça 2:");
    codigo2 = sc.nextInt();
    System.out.println("Quantidade peça 2:");
    quantidade2 = sc.nextInt();
    System.out.println("Valor da peça 2:");
    valor2 = sc.nextDouble();

    total = (valor1 * quantidade1) + (valor2 * quantidade2);

    System.out.printf("Valor a pagar: %.2f%n", total);

    sc.close();
}