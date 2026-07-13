//import entities.Product;
//import util.ProductPredicate;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Product> list = new ArrayList<>();
//        list.add(new Product("Tv", 900.0));
//        list.add(new Product("Mouse", 50.00));
//        list.add(new Product("Tablet", 350.50));
//        list.add(new Product("HD Case", 80.90));
//        Predicate<Product> pred = p -> p.getValor() >= 100.0;
//        list.removeIf(pred);
//        for (Product p : list) {
//            System.out.println(p);
//        }
//    }
//}

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(p -> p.setValor(p.getValor() * 1.1));
    }
}