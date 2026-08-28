package exercicios_curso;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class ExercicioDeFixaçãoListas {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String a =  sc.nextLine();
        int b = sc.nextInt();
        String c = "";
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Artur");
        list.add(b,a);
        System.out.println("----------------------");
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------");
        sc.nextLine();
        a =  sc.nextLine();
        final String remove = a;
        list.removeIf(x -> x.charAt(0) == remove.charAt(0));
        System.out.println("----------------------");
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("----------------------");
        a =  sc.nextLine();
        System.out.print(list.indexOf(a));
        System.out.println("----------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == remove.charAt(0)).collect(Collectors.toList());
    }
}
