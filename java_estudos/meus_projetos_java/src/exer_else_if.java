import java.util.Scanner;

public class exer_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Nao Negativo");
        }

        System.out.println("=================================");
        System.out.println("Exercicio 2");
        int numero2;
        System.out.println("Digite um numero:");
        numero2 = sc.nextInt();

        if (numero2 % 2 == 0) {
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
        System.out.println("=================================");

        System.out.println("Exercicio  3");
        System.out.println("Digite um numero:");
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A % B == 0) {
            System.out.println("Sao multiplos");
        } else if (B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
        System.out.println("=================================");
        System.out.println("Exercicio 4");
        int HI, HF;
        HI = sc.nextInt();
        HF = sc.nextInt();
        int duracao;
        if (HI < HF) {
            duracao = HF - HI;
        } else {
            duracao = 24 - HI + HF;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");


        System.out.println("=================================");
        System.out.println("Exercicio 5");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.5;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);


        System.out.println("=================================");
        System.out.println("Exercicio 6");
        double V = sc.nextDouble();
        if (V < 0 || V > 100) {
            System.out.println("Valor fora do intervalo!");
        } else if (V <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (V <= 50) {
            System.out.println("Intervalo [25,50]");
        } else if (V <= 75) {
            System.out.println("Intervalo [50,75]");
        } else if (V <= 100) {
            System.out.println("Intervalo [75,100]");
        }

        System.out.println("=================================");
        System.out.println("Exercicio 7");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        System.out.println("=================================");
        System.out.println("Exercicio 8");
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}


