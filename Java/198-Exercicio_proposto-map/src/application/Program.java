package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

    static void main() {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> eleicao = new TreeMap<>();

        System.out.print("Entre com o caminho de arquivo: ");
        String arquivo = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            String linha = br.readLine();

            while (linha != null) {
                String[] candidato = linha.split(",");
                String nome = candidato[0];
                int votos = Integer.parseInt(candidato[1]);

                if (eleicao.containsKey(nome)) {
                    votos += eleicao.get(nome);
                    eleicao.put(nome, votos);
                }
                else {
                    eleicao.put(nome, votos);
                }
                linha = br.readLine();
            }


            for (String key : eleicao.keySet()) {
                System.out.println(key + ": " + eleicao.get(key));
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
