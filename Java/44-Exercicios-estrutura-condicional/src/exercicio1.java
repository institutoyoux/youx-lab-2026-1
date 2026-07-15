import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int numero;

    System.out.println("Digite um numero:");
    numero = sc.nextInt();

    if (numero < 0) {
        System.out.println("Negativo");
    }

    else {
        System.out.println("Não negativo");
    }

    sc.close();
}