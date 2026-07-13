import java.util.Locale;

void main() {
    int y = 32;
    double x = 10.35784;
    String nome = "Maria";
    int idade = 31;
    double renda = 4000.0;

    System.out.print("Olá mundo!");
    System.out.println("Bom dia");


    System.out.println(y);


    System.out.println(x);
    System.out.printf("%.2f%n", x); // %n ou \n
    System.out.printf("%.4f%n", x);

//    trocar virgula por ponto
    Locale.setDefault(Locale.US);
    System.out.printf("%.4f%n", x);

//    Juntar elementos
    System.out.println("Resultado = " + x + " Metros");

//    juntar elementos printf
    System.out.printf("RESULTADO = %.2f metros%n", x);

    System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
}