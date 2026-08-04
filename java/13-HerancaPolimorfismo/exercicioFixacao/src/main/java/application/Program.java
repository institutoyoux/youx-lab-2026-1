package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            String op = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (op.equals("i")) {
                System.out.print("Custom fee: ");
                Double ctmFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, ctmFee));
            }
            if (op.equals("u")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, date));
            }
            else {
                products.add(new Product(name, price));
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
