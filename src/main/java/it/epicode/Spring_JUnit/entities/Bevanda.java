package it.epicode.Spring_JUnit.entities;

import it.epicode.Spring_JUnit.interfaces.VoceMenu;
import it.epicode.Spring_JUnit.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bevanda implements Printable, VoceMenu {

    private String nome;
    private double prezzo;
    private int calorie;
    private int quantity;

    @Override
    public String print() {
        return "Bevanda: " + nome + " € " + prezzo + " calorie: " + calorie + " quantità: " + quantity;
    }
}
