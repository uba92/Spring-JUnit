package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Pizza;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class PizzaConfigTest {
    @Autowired
    private Pizza margherita, diavola, prosciutto;

    @Test
    @DisplayName("Test Pizza Bean per verificare valori corretti delle pizze")
    public void testPizzaMargherita() {
        assertEquals("Margherita", margherita.getNome());
        assertEquals(5.0, margherita.getPrezzo());
        assertEquals(500, margherita.getCalorie());
        assertEquals(0,
                margherita.getTopping().size());
    }

    @Test
    @DisplayName("Test Pizza Bean per verificare valori corretti delle pizze")
    public void testPizzaDiavola() {
        assertEquals("Diavola", diavola.getNome());
        assertEquals(6.5, diavola.getPrezzo());
        assertEquals(550, diavola.getCalorie());
        assertEquals(0,
                diavola.getTopping().size());
    }

    @Test
    @DisplayName("Test Pizza Bean per verificare valori corretti delle pizze")
    public void testPizzaProsciutto() {
        assertEquals("Prosciutto", prosciutto.getNome());
        assertEquals(7.0, prosciutto.getPrezzo());
        assertEquals(600, prosciutto.getCalorie());
        assertEquals(0,
                prosciutto.getTopping().size());
    }
}
