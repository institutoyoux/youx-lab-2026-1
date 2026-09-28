package application;

import Heranca_Polimorfismo.Entities.ProductArquivos;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExArquivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ProductArquivos> lista = new ArrayList<>();

        System.out.println("Entre com um caminho: ");
        String strCaminho = sc.nextLine();

        File caminho = new File(strCaminho);
        String fontCaminho = caminho.getParent();

        // Evita erro caso o usuário digite apenas o nome do arquivo
        if (fontCaminho == null) {
            fontCaminho = ".";
        }

        boolean sucesso = new File(fontCaminho + "/out").mkdir();
        String alvoArquivoStr = fontCaminho + "/out/sumario.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strCaminho))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] arquivos = itemCsv.split(",");
                String nome = arquivos[0].trim();
                double preco = Double.parseDouble(arquivos[1].trim());
                int quantidade = Integer.parseInt(arquivos[2].trim());
                lista.add(new ProductArquivos(nome, preco, quantidade));
                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(alvoArquivoStr))) {
                for (ProductArquivos item : lista) {
                    bw.write(item.getNome() + "," + item.total());
                    bw.newLine();
                }
                System.out.println("Arquivo criado com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro de escrita dos arquivos: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        }
        sc.close();
    }
}



