package application;

import entities.ExLambdaEnt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ExLambdaEnt> dados = new ArrayList<>();

        System.out.println("Entre com o arquivo: ");
        String arquivo = sc.next();

        System.out.println("Digite o valor do salario comparatorio: ");
        Double valor = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] arquivos = linha.split(",");
                String nome = arquivos[0].trim();
                nome = nome.replace("\uFEFF", "");
                String email = arquivos[1].trim();
                email = email.replace("\uFEFF","");
                double salario = Double.parseDouble(arquivos[2].trim());

                dados.add(new ExLambdaEnt(nome,email,salario));

                linha = br.readLine();
            }

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> funcionario = dados.stream().filter( s -> s.getSalario() > valor).map(
                    p -> p.getEmail()).sorted
                    (comp.reversed()).collect(Collectors.toList());

            Double funcM = dados.stream()
                    .filter(p -> p.getEmail().startsWith("m")).
                    mapToDouble(p -> p.getSalario()).sum()
                  ;

            funcionario.forEach(System.out::println);
            System.out.println("Soma dos salarios de quem o email comeca com 'M': " +funcM);
        }



        catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

    }
}




