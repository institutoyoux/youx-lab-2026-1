package io.github.cursodsousa.arquiteturaspring.montadora.configuration;

import io.github.cursodsousa.arquiteturaspring.montadora.Motor;
import io.github.cursodsousa.arquiteturaspring.montadora.TipoMotor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Scope("singleton")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(143);
        motor.setCilindros(4);
        motor.setModelo("LFB1");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("L15B7");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(204);
        motor.setCilindros(0);
        motor.setModelo("TZ190");
        motor.setLitragem(0.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }
}
