package application;

import entities.Produtos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {

    static void main() {

        String pasta = "/home/youx/Atividades/2/exercicio.csv";
        String out = "/home/youx/Atividades/2/subdir/out.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(pasta))) {

            List<Produtos> produtos = new ArrayList<>();
            boolean arquivo = new File(out).createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(out, true));

            String linha = br.readLine();

            while (linha != null) {
                String[] dados = linha.split(",");
                double preco = Double.parseDouble(dados[1]);
                int quantidade = Integer.parseInt(dados[2]);
                produtos.add(new Produtos(dados[0], preco, quantidade));
                linha = br.readLine();
            }

            for (Produtos p : produtos) {
                bw.write(p.toString());
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}