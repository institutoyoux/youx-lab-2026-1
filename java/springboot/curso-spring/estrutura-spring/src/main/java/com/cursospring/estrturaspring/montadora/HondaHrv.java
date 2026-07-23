package com.cursospring.estrturaspring.montadora;

import java.awt.*;

public class HondaHrv extends Carro {
    public HondaHrv(Motor motor) {
        super(motor);
        setModelo("Honda Hrv");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
