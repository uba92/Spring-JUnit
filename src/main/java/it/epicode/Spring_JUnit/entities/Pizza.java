package it.epicode.Spring_JUnit.entities;

import it.epicode.Spring_JUnit.interfaces.VoceMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements VoceMenu {

    private String nome;
    private double prezzo;
    private int calorie;
    private List<Topping> toppings = new ArrayList<>();

}
