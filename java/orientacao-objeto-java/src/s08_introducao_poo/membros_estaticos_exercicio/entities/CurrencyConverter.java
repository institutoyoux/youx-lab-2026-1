package s08_introducao_poo.membros_estaticos_exercicio.entities;

public class CurrencyConverter {
    public double cotacao;
    public double valor;

    public double valorReal () {
        return taxa() * cotacao;
    }
    public double taxa() {
       return  valor + valor * 6/100;

    }



    }

