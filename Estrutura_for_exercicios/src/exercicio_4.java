import java.util.Scanner;
public class exercicio_4 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); //quantas vezes vai repetir

            for (int i=0; i<n; i++) { //repete a operação,se N vale x esse código vai se repetir N vezes

                int x = sc.nextInt(); //1 valor
                int y = sc.nextInt(); // 2 valor

                if (y == 0) { //se for igual a zero vai imprimir na tela a msg
                    System.out.println("divisao impossivel");
                }
                else { //se não,vai fazer a divisão e mostrar na tela o resultado
                    double divisao = (double) x / y;
                    System.out.printf("%.1f%n", divisao); //é oq vai ser imprimido na tela após a divisão
                }
            }

            sc.close();
        }
}
