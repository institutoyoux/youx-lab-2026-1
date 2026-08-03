package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> produto = new ArrayList<>();

        System.out.print("Digite o numero de produtos: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char resposta = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            switch (resposta) {
                case 'c':
                    produto.add(new Product(nome, preco));
                    break;
                case 'u':
                    System.out.print("Data de fabricação (DD/MM/YYYY): ");
                    Date dataFabricacao = sdf.parse(sc.next());
                    produto.add(new UsedProduct(nome, preco, dataFabricacao));
                    break;
                case 'i':
                    System.out.print("Taxa: ");
                    double taxa = sc.nextDouble();
                    produto.add(new ImportedProduct(nome, preco, taxa));
            }
        }

        System.out.println();
        System.out.println("Etiqueta de preço:");
        for (Product p : produto) {
            System.out.println(p.priceTag());
        }
    }
}
