package application;

import entities.Product;
import model.services.ProductServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    static void main() {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        ProductServices ps = new ProductServices();
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100);

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
