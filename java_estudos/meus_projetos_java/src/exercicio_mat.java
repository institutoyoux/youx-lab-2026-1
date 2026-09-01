import java.util.Scanner;
import java.util.Locale;

public class exercicio_mat {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);

    	
    	double A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;
		System.out.println("SOMA = " + soma);
		
		System.out.println("Exercicio 2");
		
		double raio,area,pi =3.14159;

		raio = sc.nextDouble();

		A =   pi * raio * raio;
		System.out.printf("Area=%.4f%n", A);

		System.out.println("Exercicio 3");

		double A1,B1,C,D;
		A1 = sc.nextInt();
		B1 = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		double DIFERENCA = A1 * B1 - C * D;

		System.out.println("Diferenca = "+DIFERENCA);

		System.out.println("Exercicio 4");

		double N,H,V;

		N = sc.nextDouble();
		H = sc.nextDouble();
		V = sc.nextDouble();

		double S1 = H * V;

		System.out.println("Numero = "+N);
		System.out.println("Salario = U$" +S1);

		System.out.println("Exercicio 5");

		double P,NP,VP,P2,N2,V2;
		P = sc.nextDouble();
		NP = sc.nextDouble();
		VP = sc.nextDouble();
		P2 = sc.nextDouble();
		N2 = sc.nextDouble();
		V2 = sc.nextDouble();

		double soma1 = VP * NP;
		double soma2 = V2 * N2;
		double soma3 = soma1 + soma2;

		System.out.println("VALOR A SER PAGO = "+soma3);

		System.out.println("Exercicio 6");

		double AG,BG,CG,triangulo,circulo,trapezio,quadrado,retangulo;
		AG = sc.nextDouble();
		BG = sc.nextDouble();
		CG = sc.nextDouble();

		triangulo = AG * CG / 2.0;
		circulo = 3.14159 * CG * CG;
		trapezio = (AG + BG) / 2.0 * CG;
		quadrado = BG * BG;
		retangulo = AG * BG;

		System.out.printf("TRIANGULO =%.3f%n",triangulo);
		System.out.printf("CIRCULO =%.3f%n",circulo);
		System.out.printf("TRAPEZIO = %.3f%n",trapezio);
		System.out.printf("QUADRADO = %.3f%n",quadrado);
		System.out.printf("RETANGULO = %.3f%n",retangulo);

		sc.close();
	}

}
