import java.util.Scanner;

void main () {
    Scanner sc = new Scanner(System.in);

    int numero;
    double horas, valor, salario;

    System.out.println("Numero do funcionario:");
    numero = sc.nextInt();
    System.out.println("Horas trabalhadas:");
    horas = sc.nextDouble();
    System.out.println("Valor da hora trabalhada:");
    valor = sc.nextDouble();

    salario = horas * valor;
    System.out.println("Numero: " + numero);
    System.out.printf("Salario = %.2f%n", salario);
}