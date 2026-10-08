import java.util.Locale;
import java.util.Scanner;//importar ferramentas que o Java já possui.

public class exc_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);//ler o que o usuário digita no teclado.

        int n;//variavel chamada n do tipo int;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();//Pegue o próximo número inteiro que o usuário digitar

        int[] vetor = new int[n];//

        for (int i=0; i<n; i++) {//O for serve para repetir alguma coisa,nesse caso vai repetir os varios numeros q foi pedido ao usuario
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();//le o nmr e guarda ele no vetor
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<n; i++) {//aqui procura quais são os negativos
            if (vetor[i] < 0) {//se a
                System.out.printf("%d\n", vetor[i]);//mprima o número inteiro que está em vetor[i] e depois pule uma linha
            }
        }

        sc.close();
    }
}
