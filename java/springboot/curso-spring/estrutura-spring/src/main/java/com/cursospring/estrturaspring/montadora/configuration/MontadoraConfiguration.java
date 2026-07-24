package com.cursospring.estrturaspring.montadora.configuration;

import com.cursospring.estrturaspring.montadora.Motor;
import com.cursospring.estrturaspring.montadora.TipoMotor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean("motorEletrico")
    @Primary
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }
    @Bean("motorAspirado")
    public Motor motorAspirado(/* @Value("${app.montadora.motor-padrao}") Integer cavalos */) {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
    @Bean("motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
