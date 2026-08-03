package entities;

public class PessoaFisica extends Contribuinte {

    private Double gastoSaude;

    public PessoaFisica(String nome, Double renda, Double gastoSaude) {
        super(nome, renda);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
        double imposto;
        if (getRenda() <= 20000) {
            imposto = (getRenda() * 15/100) - (gastoSaude / 2);
        }
        else {
            imposto = (getRenda() * 25/100) - (gastoSaude / 2);
        }
        return imposto;
    }

    public String informacoes() {
        StringBuilder sb = new StringBuilder();
        return getNome() + ": $ " + String.format("%.2f",imposto());
    }
}
