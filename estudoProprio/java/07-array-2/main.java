import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] num = {5,2,3,4};
        int[] numeros = new int[5];

        // Arrays.sort(num);
        // Arrays.fill(numeros, 10);
        System.arraycopy(num, 0, numeros, 0, num.length);
        System.out.printf("Arrays, são iguais?: %s \n",Arrays.equals(num, numeros) ? "Sim" : "Não");

        for (int i:numeros) {
            System.out.println(i);
        }
       
    }
}
