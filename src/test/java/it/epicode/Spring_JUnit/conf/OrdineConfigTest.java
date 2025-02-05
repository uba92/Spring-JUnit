package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Ordine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class OrdineConfigTest {

    @Autowired
    private Ordine ordine;

    @Test
    @DisplayName("Test per verificare correttezza ordine")
    public void testOrdine() {

        double totPrezzoCoperti = ordine.getCostoCoperto() * ordine.getNumeroCoperti();

        assertEquals(totPrezzoCoperti, ordine.getCostoCoperto()* ordine.getNumeroCoperti());
        assertEquals(21.5, ordine.calcolaTotaleOrdine());
        assertEquals(1, ordine.getTavolo().getNumeroTavolo());


    }
}
