package com.cursospring.estrturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);


        builder.bannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext applicationContext = builder.run(args);
       // var produtoRepository = applicationContext.getBean("produtoRepository");

        builder.profiles("producao");
        builder.run(args);
//        builder.properties("spring.datasource.url=jdbc://");
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String nome = environment.getProperty("spring.application.name");
        System.out.println(nome);

    }

}
