package io.github.cursodsousa.arquiteturaspring.montadora;

import java.awt.*;

public class HondaCivic extends Carro {

    public HondaCivic(Motor motor) {
        super(motor);
        setModelo("Civic");
        setColor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
