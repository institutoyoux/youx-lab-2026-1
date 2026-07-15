import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int numero;

    System.out.println("Digite um numero:");
    numero = sc.nextInt();

    if (numero % 2 == 0) {
        System.out.println("Par");
    }
    else {
        System.out.println("Impar");
    }

    sc.close();
}