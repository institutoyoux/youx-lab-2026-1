package Tratamento_excecoes.application;
import Tratamento_excecoes.entities.Conta;
import Tratamento_excecoes.exceptions.RegraNegocioException;
import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Program {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("SISTEMA BANCARIO: Entre com os dados da conta");
            System.out.println();
            System.out.print("Numero: ");
            Integer numero = sc.nextInt();
            System.out.print("Titular: ");
            String titular = sc.next();
            System.out.print("Saldo: ");
            Double saldo = sc.nextDouble();
            System.out.print("Limite de saque: ");
            Double limite = sc.nextDouble();
            System.out.println();
            System.out.print("Quanto quer sacar: ");
            Double saque = sc.nextDouble();

            Conta  conta = new Conta(numero,titular,saldo,limite,saque);

            System.out.println("Novo saldo: " + conta.sacar());
        }

        catch (RegraNegocioException regraNegocioException) {
            System.out.println(regraNegocioException.getMessage());
        }


    }
}
