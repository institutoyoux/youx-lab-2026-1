package entities;

public class PessoaJuridica extends Contribuinte {

    private Integer numeroFuncionarios;

    public PessoaJuridica(String nome, Double renda, Integer numeroFuncionarios) {
        super(nome, renda);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double imposto() {
        double Imposto;
        if (numeroFuncionarios > 10) {
            Imposto = getRenda() * 14/100;
        }
        else {
            Imposto = getRenda() * 16/100;
        }
        return Imposto;
    }

    public String informacoes() {
        StringBuilder sb = new StringBuilder();
        return getNome() + ": $ " + String.format("%.2f", imposto());
    }
}
