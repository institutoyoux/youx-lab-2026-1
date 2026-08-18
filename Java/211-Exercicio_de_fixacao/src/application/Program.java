package application;

import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
// /home/youx/Atividades/2/in.txt

    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Entre com o local do arquivo: ");
        String arquivo = sc.nextLine();
        System.out.print("Digite o salario: ");
        double salario = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            String linha = br.readLine();
            while (linha != null) {

                String[] fields = linha.split(",");
                funcionarios.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
                linha = br.readLine();
            }

            System.out.printf("Email das pessoas com salario maior que %.2f:\n", salario);
            List<String> emails = funcionarios.stream()
                    .filter(p -> p.getSalario() > salario)
                    .map(p -> p.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double salarioM = funcionarios.stream()
                    .filter(p -> p.getNome().charAt(0) == 'M')
                    .map(p -> p.getSalario())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println("Somario do salario das pessoas que o nome começa com 'M': " + String.format("%.2f", salarioM));

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
