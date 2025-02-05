package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Ordine;
import it.epicode.Spring_JUnit.interfaces.VoceMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class OrdineConfigTest {

    @Autowired
    private Ordine ordine;
    @Autowired
    private Ordine newOrdine;

    @Test
    @DisplayName("Test per verificare correttezza ordine")
    public void testOrdine() {

        double totPrezzoCoperti = ordine.getCostoCoperto() * ordine.getNumeroCoperti();

        assertEquals(totPrezzoCoperti, ordine.getCostoCoperto()* ordine.getNumeroCoperti());
        assertEquals(21.5, ordine.calcolaTotaleOrdine());
        assertEquals(1, ordine.getTavolo().getNumeroTavolo());


    }


    @MethodSource("ordiniForniti")
    @DisplayName("Test per controllare il metodo calcolaTotaleOrdine()")

    public void testTotaleOrdine(Ordine ordine) {
        double totCoperti = ordine.getNumeroCoperti()*ordine.getCostoCoperto();
        double totCostoElementi = ordine.getListaElementiOrdine().stream().mapToDouble(VoceMenu::getPrezzo).sum();
        double totDaPagare = totCoperti + totCostoElementi;

        assertEquals(totDaPagare, ordine.calcolaTotaleOrdine());
    }

    public static Stream<Ordine> ordiniForniti(Ordine ordine,Ordine newOrdine) {

        return Stream.of(ordine, newOrdine);
    }
}
