package GenericSetMap.application;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos estudantes para o curso A?  ");
     int nA = sc.nextInt();

        Set<Integer> estudantesTotais = new HashSet<>();

        for (int i = 0; i<nA ; i++) {
            int valorA = sc.nextInt();
            estudantesTotais.add(valorA);
        };

     System.out.print("Quantos estudantes para o curso B? ")   ;
     int nB = sc.nextInt();

     for (int i = 0; i< nB; i++) {
         int valorB = sc.nextInt();
         estudantesTotais.add(valorB);
     }

     System.out.print("Quantos estudantes para o curso C? ")   ;
     int nC = sc.nextInt();

     for (int i = 0; i<nC ; i++) {
         int valorC = sc.nextInt();
         estudantesTotais.add(valorC);
     }


        System.out.print("Estudantes totais: " + estudantesTotais.size());




    }
}
