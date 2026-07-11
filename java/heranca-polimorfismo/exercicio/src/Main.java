import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> produtos = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int total = input.nextInt();
        for (int i=0; i < total; i++) {
            System.out.printf("Product #%d data:", i+1);
            System.out.print("Common, used or imported? (c/u/i)?: ");
            String type = input.next();
            String name;
            Double price;
            if (type.equals("c")) {
                System.out.print("Nome: ");
                name = input.next();
                System.out.print("Preço: ");
                price = input.nextDouble();
                Product produto = new Product(name, price);
                produtos.add(produto);
            }
            if (type.equals("u")) {
                System.out.print("Nome: ");
                name = input.next();
                System.out.print("Preço: ");
                price = input.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String data = input.next();
                Date finalDate = sdf.parse(data);
                UsedProduct produto = new UsedProduct(name, price, finalDate);
                produtos.add(produto);
            }
            if (type.equals("i")) {
                System.out.print("Nome: ");
                name = input.next();
                System.out.print("Preço: ");
                price = input.nextDouble();
                System.out.print("Customs fee: ");
                Double custom = input.nextDouble();
                ImportedProduct produto = new ImportedProduct(name, price, custom);
                produtos.add(produto);
            }
        }
        System.out.println("Price Tags: ");
        for (Product produto : produtos) {
            System.out.println(produto.priceTag());
        }
    }
}