package Tratamento_excecoes.entities;

import Tratamento_excecoes.exceptions.RegraNegocioException;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limite;
    private Double saque;

    public Conta(Integer numero, String titular, Double saldo, Double limite, Double saque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        this.saque = saque;
    }

    public void depositar(Double deposito) {
        saldo += deposito;
    }

    public Double sacar() {
        if (saque > saldo) {
            throw new RegraNegocioException("Erro ao sacar: nao tem saldo suficiente");
        }
        else if (saque > limite) {
            throw new RegraNegocioException("Erro ao sacar: A quantia excede o limite da conta");
        }
        return saldo -= saque;
    }

    public Integer getNumero() {
        return  numero;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

}
