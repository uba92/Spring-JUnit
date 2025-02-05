package it.epicode.Spring_JUnit.runner;

import it.epicode.Spring_JUnit.entities.Menu;
import it.epicode.Spring_JUnit.entities.Ordine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Autowired
    private Ordine ordine;

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println(menu.print());
//    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(ordine.print());
    }
}
