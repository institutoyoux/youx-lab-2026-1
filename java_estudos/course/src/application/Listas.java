package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Thanos");
        list.add("Ultron");
        list.add("Kang");
        list.add(2,"Dr Doom"); // adiciona na posicao 2
        list.add(4,"Fenix");  // adiciona na posicao 4
        list.add(1,"Magneto");
        list.add("Taskmaster");

        System.out.println(list.size()); // mostra o tamanho da lista.

        for(String x: list) {    //para cada x (dado) em list, ele vai mostrar o x.
            System.out.println(x);
        }

        System.out.println("--------------------------------------------------------------------");
        list.remove("Ultron"); // remove o ultron
        list.removeIf(x -> x.charAt(0) =='M');  // remove o x se ele iniciar com a letra M (visto que o x[0] e o primeiro caracter).

        for(String x: list) {    //para cada x (dado) em list, ele vai mostrar o x.
            System.out.println(x);
        }

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Posicao de Dr Doom: " +list.indexOf("Dr Doom"));

        System.out.println("--------------------------------------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').toList();

        for(String x: result) {    //para cada x (dado) em result, ele vai mostrar o x.
            System.out.println(x);
        }

        System.out.println("--------------------------------------------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'T').findFirst().orElse(null);
        System.out.println(name);
    }
}