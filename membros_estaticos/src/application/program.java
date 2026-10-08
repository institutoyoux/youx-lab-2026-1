package application;
import java.util.Locale;
import java.util.Scanner;
public class program {

        public static final double PI = 3.14159;
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);


            Scanner sc = new Scanner(System.in);
            System.out.print("Enter radius: ");//imprimir pra pessoa dgt o raio
            double radius = sc.nextDouble();//ler a variavel raio
            double c = circumference(radius);//variavel c recebe raio como argumento
            double v = volume(radius);//v recebe um volume de uma esfera q teria esse raio
            System.out.printf("Circumference: %.2f%n", c);
            System.out.printf("Volume: %.2f%n", v);
            System.out.printf("PI value: %.2f%n", PI);

            sc.close();
        }
        public static double circumference(double radius) {
            return 2.0 * PI * radius;//se tirar o static o pg n vai funcionar,pq o main é static ou seja vc n pode chamar um metodo main q n é estatic dentro de um q é estatic
        }
        public static double volume(double radius) {
            return 4.0 * PI * radius * radius * radius / 3.0;
        }
    }
