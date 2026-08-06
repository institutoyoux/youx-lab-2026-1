package exercicios_curso;
import java.util.Scanner;
public class ExercicioTreinamentoEstruturaCondicional_5 {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);
        float valorId = 0;
        float valor = 0;
        System.out.println("[ID: 1] - [Nome: Cachorro Quente ] - [Preço: 4.00]");
        System.out.println("[ID: 2] - [Nome: X-Salada ]        - [Preço: 4.50]");
        System.out.println("[ID: 3] - [Nome: X-Bacon]          - [Preço: 5.00]");
        System.out.println("[ID: 4] - [Nome: Torrada Simples]  - [Preço: 2.00]");
        System.out.println("[ID: 5] - [Nome: Refrigerante]     - [Preço: 1.50]");
        System.out.print("Escolha um produto: ");
        int id = teste.nextInt();
        if (id == 1){
            valorId += 4.00;
        }
        if (id == 2){
            valorId += 4.50;
        }
        if (id == 3){
            valorId += 5.00;
        }
        if (id == 4){
            valorId += 2.00;
        }
        if (id == 5){
            valorId += 1.50;
        }

        System.out.print("Digite a quatidade: ");
        int quantidade = teste.nextInt();
        valor = quantidade * valorId;
        System.out.print("Valor final: R$" + valor);
    }
}
