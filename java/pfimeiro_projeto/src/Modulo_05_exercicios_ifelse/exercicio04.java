package Modulo_05_exercicios_ifelse;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hi = sc.nextInt();
        int hf = sc.nextInt();
        int total;
        if(hi > hf) {
            total = hi - hf ;
            System.out.printf("O jogo durou %d horas", total);
        }
        else if(hi < hf) {
            total = hf - hi;
            System.out.printf("O jogo durou %d horas", total);
        }
        else {
            System.out.println("O jogo durou 24 horas");
        }

    }
}
