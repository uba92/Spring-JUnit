package it.epicode.Spring_JUnit.entities;

import it.epicode.Spring_JUnit.interfaces.VoceMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements VoceMenu {

    private String nome;
    private double prezzo;
    private int calorie;
    private List<Topping> toppings = new ArrayList<>();

    public List<Topping> getTopping() {
        return toppings;
    }
}
