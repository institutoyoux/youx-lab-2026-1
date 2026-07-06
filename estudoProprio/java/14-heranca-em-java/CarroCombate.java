public class CarroCombate extends Carro {
    private final int max_arm = 100;
    private final int min_arm = 0;
    private int qtdArm;
    public CarroCombate(String nome, int blindagem) {
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qtdArm = 100;
    }
    public void setQtdArm(int armamento) {
        this.qtdArm += armamento;
        if (this.qtdArm > this.max_arm) {
            this.qtdArm = this.max_arm;
        } else if (this.qtdArm < this.min_arm) {
            this.qtdArm = this.min_arm;
        }
    }
    public int getQtdArm() {
        return this.qtdArm;
    }
    public void atirar() {
        if (this.qtdArm > this.min_arm) {
            setQtdArm(-1);
        } else {
            System.out.println("Sem munição");
        }
    }
    public void info() {
        super.info();
        System.out.printf("Quantidade de armamento: %d\n", this.getQtdArm());
    }
}