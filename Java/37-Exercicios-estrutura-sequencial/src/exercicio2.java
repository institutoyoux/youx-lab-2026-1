import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    double raio, pi, area;

    pi = 3.14159;

    System.out.println("Digite o raio de um circulo:");
    raio = sc.nextDouble();

    area = pi * Math.pow(raio, 2);

    System.out.printf("Area do circulo: %.4f%n", area);
    sc.close();
}