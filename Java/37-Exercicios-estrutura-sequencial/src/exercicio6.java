import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    double a, b, c, pi, triangulo, circulo,trapezio, quadrado, retagulo;

    pi = 3.14159;

    System.out.println("Valor A:");
    a = sc.nextFloat();
    System.out.println("Valor B:");
    b = sc.nextFloat();
    System.out.println("Valor C:");
    c = sc.nextFloat();

    triangulo = (a * c) / 2;
    circulo = pi * Math.pow(c, 2.0);
    trapezio = (a + b) * c / 2;
    quadrado = b * b;
    retagulo = a * b;

    System.out.printf("Triangulo: %.3f%n", triangulo);
    System.out.printf("Circulo: %.3f%n", circulo);
    System.out.printf("Trapezio: %.3f%n", trapezio);
    System.out.printf("Quadrado: %.3f%n", quadrado);
    System.out.printf("Retangulo: %.3f%n", retagulo);

    sc.close();
}