package exercicios_curso;
import java.util.Locale;
import java.util.Scanner;
import entities.EntitiesVetores;
public class ExercicioTreinamentoVetores_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados? ");
        int n = sc.nextInt();
        int tot = 0;
        EntitiesVetores[] vect = new EntitiesVetores[n];

        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            double numero = sc.nextDouble();
            vect[i] = new EntitiesVetores(numero);
        }
        System.out.println("");
        System.out.println("Numeros pares: ");
        for (int i = 0; i<n; i++){
            if(vect[i].getNumero() % 2 == 0){
                System.out.print(vect[i].getNumero());
                System.out.print(" ");
                tot += 1;
            }
        }
        System.out.println("");
        System.out.print("\nTotal de pares: ");
        System.out.println(tot);
    }
}