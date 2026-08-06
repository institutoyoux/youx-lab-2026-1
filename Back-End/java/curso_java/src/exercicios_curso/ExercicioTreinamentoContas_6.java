package exercicios_curso;

public class ExercicioTreinamentoContas_6 {
    public static void main (String[] arg){
        double a, b, c;
        //
        a = 3.0;
        b = 4.0;
        c = 5.2;
        //
        double pi, triangulo, circulo, trapezio, quadrado, retangulo;
        //
        pi = 3.14159;
        //
        triangulo = a * c / 2.0;
        circulo = pi * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;
        //
        System.out.print("Triangulo = %.3f%n".formatted(triangulo));
        System.out.print("Circulo = %.3f%n".formatted(circulo));
        System.out.print("Trapezio = %.3f%n".formatted(trapezio));
        System.out.print("Quadrado = %.3f%n".formatted(quadrado));
        System.out.print("Retangulo = %.3f%n".formatted(retangulo));
        System.out.println();
        //
        a = 12.7;
        b = 10.4;
        c = 15.2;
        //
        triangulo = a * c / 2.0;
        circulo = pi * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;
        //
        System.out.print("Triangulo = %.3f%n".formatted(triangulo));
        System.out.print("Circulo = %.3f%n".formatted(circulo));
        System.out.print("Trapezio = %.3f%n".formatted(trapezio));
        System.out.print("Quadrado = %.3f%n".formatted(quadrado));
        System.out.print("Retangulo = %.3f%n".formatted(retangulo));
    }
}