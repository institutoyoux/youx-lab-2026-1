package Modulo_07_bitwise;

public class modulo07_split {
    public static void main(String[] args) {

        String s = "potato apple lemon orange";

        String[] vect = s.split("   ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}