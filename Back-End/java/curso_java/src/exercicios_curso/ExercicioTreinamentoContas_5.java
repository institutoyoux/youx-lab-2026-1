package exercicios_curso;

public class ExercicioTreinamentoContas_5 {
    public static void main(String[] args){
        int id1a = 1;
        int unidades1a = 1;
        double valor1a = 5.30;
        //
        int id2a = 1;
        int unidades2a = 2;
        double valor2a = 5.10;
        //
        double valor_total1a = (unidades1a * valor1a) + (unidades2a * valor2a);
        System.out.print("Valor a Pagar: %.2f%n".formatted(valor_total1a));

        System.out.println();

        int id1b = 1;
        int unidades1b = 2;
        double valor1b = 15.30;
        //
        int id2b = 1;
        int unidades2b = 4;
        double valor2b = 5.20;
        //
        double valor_total1b = (unidades1b * valor1b) + (unidades2b * valor2b);
        System.out.print("Valor a Pagar: %.2f%n".formatted(valor_total1b));

        System.out.println();

        int id1c = 1;
        int unidades1c = 1;
        double valor1c = 15.10;
        //
        int id2c = 1;
        int unidades2c = 1;
        double valor2c = 15.10;
        //
        double valor_total1c = (unidades1c * valor1c) + (unidades2c * valor2c);
        System.out.print("Valor a Pagar: %.2f%n".formatted(valor_total1c));

    }
}
