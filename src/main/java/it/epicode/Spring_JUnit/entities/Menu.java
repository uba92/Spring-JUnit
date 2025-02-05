package it.epicode.Spring_JUnit.entities;

import it.epicode.Spring_JUnit.interfaces.VoceMenu;
import it.epicode.Spring_JUnit.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    private String nome;
    private List<VoceMenu> voceMenu = new ArrayList<>();

}
