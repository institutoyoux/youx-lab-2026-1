package exercicios_curso;

public class ExercicioTreinamentoContas_2 {
    public static void main(String[] args){

        double pi = 3.14159;

        double entrada1 = 2.00;
        double area1 = entrada1 * entrada1 * pi;

        double entrada2 = 100.64;
        double area2 = entrada2 * entrada2 * pi;

        double entrada3 = 150.00;
        double area3 = entrada3 * entrada3 * pi;

        System.out.print("Area = %.4f%n".formatted(area1));

        System.out.print("Area = %.4f%n".formatted(area2));

        System.out.print("Area = %.4f%n".formatted(area3));
    }
}
