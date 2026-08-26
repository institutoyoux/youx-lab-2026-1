package Modulo_06_exercicios_while;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (num >= 1 && num < 4) {
            if (num == 1) {
                alcool += 1;
            }
            else if (num == 2) {
                gasolina += 2;
            }
            else {
                diesel += 3;
            }
            num = sc.nextInt();
        }
        System.out.println("alcool:" + alcool);
        System.out.println("gasolina:" + gasolina);
        System.out.println("diesel:" + diesel);
        System.out.println("Muito Obrigada:");


    }

}
