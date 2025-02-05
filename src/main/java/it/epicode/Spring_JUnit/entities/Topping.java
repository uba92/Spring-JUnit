package it.epicode.Spring_JUnit.entities;

import it.epicode.Spring_JUnit.interfaces.VoceMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Topping implements VoceMenu {
    private String nome;
    private double prezzo;
    private int calorie;
}
