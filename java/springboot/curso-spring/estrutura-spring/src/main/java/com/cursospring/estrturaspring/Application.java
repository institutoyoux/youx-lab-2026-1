package com.cursospring.estrturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);


        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("producao", "homologado");
        // builder.lazyInitialization(true);
        builder.run(args);

        ConfigurableApplicationContext applicationContext = builder.context();
       // var produtoRepository = applicationContext.getBean("produtoRepository");

//        builder.properties("spring.datasource.url=jdbc://");
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String nome = environment.getProperty("spring.application.name");
        System.out.println(nome);
        ExemploValue value = applicationContext.getBean(ExemploValue.class);
        value.imprimirVariavel();
        AppProperties context = applicationContext.getBean(AppProperties.class);
        System.out.println(context.getValor1());
    }

}
