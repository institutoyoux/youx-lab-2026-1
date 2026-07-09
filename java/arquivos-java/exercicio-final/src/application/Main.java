package application;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "/home/instituto/youx-lab-2026-1/java/arquivos-java/exercicio-final/pedidos.csv";
        String subPath = "/home/instituto/youx-lab-2026-1/java/arquivos-java/exercicio-final/resp/summary.csv";
        File file = new File(path);
        File out = new File(subPath);
        Scanner input = null;
        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                String[] produtos = input.nextLine().split("\n");
                for (String produto : produtos) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(subPath, true))) {
                        String[] itens = produto.split(",");
                        bw.write(itens[0] + "," + Double.parseDouble(itens[1]) * Double.parseDouble(itens[2]));
                        bw.newLine();
                    }
                    catch (IOException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
            }
            System.out.println("Arquivo criado com sucesso!");
        } catch (java.io.FileNotFoundException e) {
    throw new RuntimeException(e);
}
    }
}