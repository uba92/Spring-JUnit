package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Bevanda;
import it.epicode.Spring_JUnit.entities.Menu;
import it.epicode.Spring_JUnit.entities.Pizza;
import it.epicode.Spring_JUnit.entities.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {
    private final Topping salame, cotto, pomodoro, mozzarella;
    private final Pizza margherita, diavola, prosciutto;
    private final Bevanda acqua, fanta, cocaCola;


    @Bean
    public Menu menu() {
        Menu m = new Menu();
        m.setNome("Menu del Giorno");
        m.setVoceMenu(List.of( margherita, diavola, prosciutto, acqua, fanta, cocaCola));
        return m;
    }
}
