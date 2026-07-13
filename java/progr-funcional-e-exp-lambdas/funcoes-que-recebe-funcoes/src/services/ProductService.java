package services;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criterio) {
        double sum = 0.0;
        for (Product product : list) {
            if (criterio.test(product)) {
                sum += product.getValor();
            }
        }
        return sum;
    }
}
