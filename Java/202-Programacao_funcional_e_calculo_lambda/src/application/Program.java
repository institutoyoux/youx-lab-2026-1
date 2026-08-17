package application;

import entities.Product;

import java.util.Arrays;

public class Program {

    public static int globalValues = 3;

    static void main() {

        int[] vect = new int[] {3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    private static void changeOddValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValues;
            }
        }
    }
}
