package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Bevanda;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BevandaConfigTest {

    @Autowired
    private Bevanda acqua, fanta, cocaCola;

    @ParameterizedTest
    @CsvSource({"Acqua, 1.0, 20, 500", "Fanta, 2.5, 200, 330", "Coca Cola, 2.5, 200, 330"})
    @DisplayName("Test Bevanda Bean per verificare valori corretti di tutte le bevande")
    public void testBevande() {

    }
}
