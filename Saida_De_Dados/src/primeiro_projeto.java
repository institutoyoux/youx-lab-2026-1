import java.util.Locale;

import java.util.Locale;

public class primeiro_projeto {

    public static void main(String[] args) {
    //println faz uma quebra de linha,e o print normal deixa tudo na mesma linha

        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        //%s → texto (String) → nome
        //%d → número inteiro (int) → idade
        //%.2f → número decimal (double/float) com 2 casas decimais → renda
        //%n → quebra de linha


    }
}


//public class primeiro_projeto {
//  public static void main(String[] args) {
//  double b, B, h, area;
//  b = 6.0;
//  B = 8.0;
//  h = 5.0;
//  area = (b + B) / 2.0 * h;
//  System.out.println(area);
//  }

