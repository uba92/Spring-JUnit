package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Bean
    public Topping pomodoro() {
        Topping t = new Topping();
        t.setNome("Pomodoro");
        t.setPrezzo(0.5);
        return t;
    }

    @Bean
    public Topping mozzarella() {
        Topping t = new Topping();
        t.setNome("Mozzarella");
        t.setPrezzo(0.5);
        return t;
    }

    @Bean
    public Topping salame() {
        Topping t = new Topping();
        t.setNome("Salame");
        t.setPrezzo(0.5);
        return t;
    }

    @Bean
    public Topping cotto() {
        Topping t = new Topping();
        t.setNome("Prosciutto cotto");
        t.setPrezzo(0.5);
        return t;
    }
}
