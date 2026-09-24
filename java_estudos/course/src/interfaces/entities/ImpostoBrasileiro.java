package interfaces.entities;

public class ImpostoBrasileiro implements Imposto {
    @Override
    public double calcularImposto(double valor) {
        if (valor <= 100) {
            return valor * 0.20;
        }
        else {
            return valor * 0.15;
        }


    }

}
