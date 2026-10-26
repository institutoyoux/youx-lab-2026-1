import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Trabalho {
    public static void main(String[] args){

        // -------------- Objects -------------- //

        Scanner sc = new Scanner(System.in);
        String nome = "";
        String escolha = "";

        String produtos = "products";
        String txtPath = "";

        String nomeProduto = "";
        double precoProduto = 0;
        double precoTotal = 0;
        double avaliacaoProduto = 0;

        String[] notas = new String[]{};
        double somaNotas = 0;
        int id = 0;
        int maxId = 0;

        String confirmacao = "n";
        int escolhaProduto = 0;
        String escolhaProdutoAvaliador = "";
        String continuarCompra = "s";
        String salvarProduto = "";
        int quantidadeProduto = 0;
        String quantidadeProdutoAvaliador = "";
        int idAleatorio = ThreadLocalRandom.current().nextInt(100000, 999999);
        String idFinalPedido = "produtoPedido-Id%s".formatted(idAleatorio);

        Instant momentoExato = Instant.now();
        ZonedDateTime horarioLocal = momentoExato.atZone(ZoneId.systemDefault());
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = horarioLocal.format(formatador);

        // ------------------------------------- //

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        System.out.println("-------------------| Shop-Service |-------------------");

        System.out.print("Digite seu nome completo: ");
        nome = sc.nextLine();

        txtPath = idFinalPedido;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtPath, true))) {
            bw.write("Nome: %s".formatted(nome));
            bw.newLine();
            bw.write("Data do pedido: %s".formatted(dataFormatada));
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------------");

        System.out.print("Escolha uma opção: \n[1]- Menu | [2]- Carrinho | [3]- Finalizar \nSua escolha: ");
        escolha = sc.nextLine();

        while (!escolha.equals("3")) {

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------//

            if (escolha.equals("1")) {

                System.out.println("---------------------| Produtos |---------------------");

                try (BufferedReader br = new BufferedReader(new FileReader(produtos))) {

                    String line = br.readLine();
                    while (line != null) {

                        id += 1;
                        String[] fields = line.split(";");
                        nomeProduto = fields[0].trim();
                        precoProduto = Double.parseDouble(fields[1].trim());
                        notas = fields[2].split(",");

                        for (String nota : notas) {
                            somaNotas += Double.parseDouble(nota.trim());
                        }
                        avaliacaoProduto = somaNotas / notas.length;
                        System.out.println("|ID: %s |Nome: %s |Preço: $%s |Avaliação: %s ".formatted(id, nomeProduto, precoProduto, avaliacaoProduto));
                        line = br.readLine();
                        somaNotas = 0;
                    }

                } catch (IOException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }

                maxId = id;
                id = 0;
                somaNotas = 0;

                System.out.println("------------------------------------------------------");

                System.out.print("[1]- Menu | [2]- Carrinho | [3]- Finalizar \nSua escolha: ");
                escolha = sc.nextLine();

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------//

            } else if (escolha.equals("2")) {

                try (BufferedReader br = new BufferedReader(new FileReader(produtos))) {

                    String line = br.readLine();

                    while (line != null) {

                        id += 1;
                        String[] fields = line.split(";");
                        nomeProduto = fields[0].trim();
                        precoProduto = Double.parseDouble(fields[1].trim());
                        notas = fields[2].split(",");

                        for (String nota : notas) {
                            somaNotas += Double.parseDouble(nota.trim());
                        }
                        avaliacaoProduto = somaNotas / notas.length;
                        line = br.readLine();
                        somaNotas = 0;
                    }

                } catch (IOException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }

                maxId = id;
                id = 0;
                somaNotas = 0;

                System.out.println("---------------------| Carrinho |---------------------");

                System.out.println("Começando compra...");

                while (continuarCompra.equalsIgnoreCase("s")) {
                    while (confirmacao.equalsIgnoreCase("n")) {
                        try {
                            System.out.print("Digite um id para adicionar ao carrinho: [ > 0 ou inferior < para cancelar] ");
                            escolhaProdutoAvaliador = sc.nextLine();
                            escolhaProduto = Integer.parseInt(escolhaProdutoAvaliador);
                            confirmacao = "s";
                        } catch (Exception e) {
                            System.out.println("Tente novamente, numero escrito de forma invalida.");
                        }
                    }
                    confirmacao = "n";
                    if (escolhaProduto > 0 && escolhaProduto <= maxId) {
                        while (confirmacao.equalsIgnoreCase("n")) {
                            try {
                                System.out.print("Digite a quantidade deste produto: ");
                                quantidadeProdutoAvaliador = sc.nextLine();
                                quantidadeProduto = Integer.parseInt(quantidadeProdutoAvaliador);
                                confirmacao = "s";
                            } catch (Exception e) {
                                System.out.println("Tente novamente, numero escrito de forma invalida.");
                            }
                        }
                        confirmacao = "n";
                        try (BufferedReader br = new BufferedReader(new FileReader(produtos))) {

                            String line = br.readLine();

                            while (line != null) {

                                String[] fields = line.split(";");
                                nomeProduto = fields[0].trim();
                                precoProduto = Double.parseDouble(fields[1].trim());
                                notas = fields[2].split(",");

                                for (String nota : notas) {
                                    somaNotas += Double.parseDouble(nota.trim());
                                }
                                avaliacaoProduto = somaNotas / notas.length;
                                line = br.readLine();
                                if (id == escolhaProduto) {
                                    salvarProduto = "|ID: %s |Nome: %s |Preço: $%s |Avaliação: %s |Quantidade %s ".formatted(id, nomeProduto, precoProduto, avaliacaoProduto, quantidadeProduto);
                                    precoTotal = precoProduto * quantidadeProduto;
                                }
                                id += 1;
                                somaNotas = 0;
                            }

                        } catch (IOException e) {
                            System.out.println("ERROR: " + e.getMessage());
                        }

                        id = 0;
                        somaNotas = 0;

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtPath, true))) {
                            bw.write(salvarProduto);
                            bw.newLine();
                            System.out.println("Produto salvo no carrinho com sucesso!");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.print("Continuar compra? [S|N] ");
                        continuarCompra = sc.next();
                        sc.nextLine();

                    } else if (escolhaProduto <= 0) {

                        System.out.print("Nenhum produto escolhido.\nContinuar comprando? [S|N] ");
                        continuarCompra = sc.next();
                        sc.nextLine();

                    }else {
                        System.out.print("Nenhum produto escolhido.\nContinuar comprando? [S|N] ");
                        continuarCompra = sc.next();
                        sc.nextLine();
                    }
                    while (!continuarCompra.equalsIgnoreCase("s") && !continuarCompra.equalsIgnoreCase("n")) {
                        System.out.print("Escolha invalida, continuar? [S|N] ");
                        continuarCompra = sc.next();
                        sc.nextLine();
                    }
                }

            continuarCompra = "s";

                System.out.println("------------------------------------------------------");

                System.out.print("[1]- Menu | [2]- Carrinho | [3]- Finalizar \nSua escolha: ");
                escolha = sc.nextLine();

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------//

            }else {
                System.out.print("Opção invalida, escolha uma das opções abaixo: \n[1]- Menu | [2]- Carrinho | [3]- Finalizar \nSua escolha: ");
                escolha = sc.nextLine();
            }
        }
        System.out.println("------------------------------------------------------");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtPath, true))) {
            bw.write("Preço total: %s".formatted(precoTotal));
            bw.newLine();
            System.out.println("Preço total: %s".formatted(precoTotal));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (precoTotal == 0){
            try {
                Files.delete(Path.of(idFinalPedido));

                System.out.println("Done!");

            } catch (IOException e) {
                System.out.println("ERROR: File not found.");
            }
            System.out.print("Finalizando... ");
        }else {
            System.out.print("Finalizando... [Pedido enviado: %s]".formatted(idFinalPedido));

        }
        sc.close();

    }
}
