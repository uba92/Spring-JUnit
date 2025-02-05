package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    public Pizza margherita() {
        Pizza p = new Pizza();
        p.setNome("Margherita");
        p.setPrezzo(5.0);
        p.setCalorie(500);
        return p;
    }

    @Bean
    public Pizza diavola() {
        Pizza p = new Pizza();
        p.setNome("Diavola");
        p.setPrezzo(6.5);
        p.setCalorie(550);
        return p;
    }

    @Bean
    public Pizza prosciutto() {
        Pizza p = new Pizza();
        p.setNome("Prosciutto");
        p.setPrezzo(7.0);
        p.setCalorie(600);
        return p;
    }

}
