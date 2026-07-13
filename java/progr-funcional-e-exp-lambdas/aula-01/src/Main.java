import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

//        Comparator<Product> com = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
//            }
//        };

        Comparator<Product> com = (p1, p2) -> {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        };

//        list.sort(new MyComparator());
        list.sort(com);
        for (Product produto : list) {
            System.out.println(produto);
        }
    }
}