package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Menu;
import it.epicode.Spring_JUnit.entities.Ordine;
import it.epicode.Spring_JUnit.entities.Tavolo;
import it.epicode.Spring_JUnit.enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OrdineConfig {
    @Autowired
    private Tavolo tavolo;

    @Autowired
    private Menu menu;

    @Bean
    public Ordine ordine() {
        Ordine o = new Ordine();
        o.setNumeroOrdine(1);
        o.setStatoOrdine(StatoOrdine.IN_CORSO);
        o.setTavolo(tavolo);
        o.setNumeroCoperti(2);
        o.setCostoCoperto(1.5);
        o.setListaElementiOrdine(List.of(menu.getVoceMenu().get(0), menu.getVoceMenu().get(1), menu.getVoceMenu().get(2)));
        return o;
    }
}
