package GenericSetMap.application;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> dados = new HashMap<>();

        System.out.println("Entre com o arquivo: ");
        String arquivo = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] arquivos = linha.split(",");

                if (arquivos.length == 2) {
                    String nome = arquivos[0].trim();
                    nome = nome.replace("\uFEFF", "");
                    Integer numero = Integer.parseInt(arquivos[1].trim());

                    dados.merge(nome, numero, Integer::sum);
                }
                linha = br.readLine();
            }

            System.out.println("Resultados eleicoes: ");
            for (String info : dados.keySet()) {
                System.out.println(info + " : " + dados.get(info));
            }

        }


        catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
