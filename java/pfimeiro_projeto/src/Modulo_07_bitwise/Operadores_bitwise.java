package Modulo_07_bitwise;

import java.util.Scanner;

public class Operadores_bitwise {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if ( (n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }

        }
}
