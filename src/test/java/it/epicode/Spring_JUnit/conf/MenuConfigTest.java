package it.epicode.Spring_JUnit.conf;

import it.epicode.Spring_JUnit.entities.Menu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MenuConfigTest {

    @Autowired
    private Menu menu;

    @Test
    @DisplayName("Test Menu Bean per verificare il nome del menu e la size!")
    public void testMenuBean() {

        assertEquals("Menu del Giorno", menu.getNome());
        assertEquals(6, menu.getVoceMenu().size());
    }

    @Test
    @DisplayName("test menu Bean - Verifica che la lista voceMenu non sia null")
    public void testMenuBean2() {
        assertNotNull(menu.getVoceMenu());
    }
}
