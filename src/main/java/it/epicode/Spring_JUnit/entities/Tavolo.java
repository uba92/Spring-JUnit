package it.epicode.Spring_JUnit.entities;

import it.epicode.Spring_JUnit.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
    private int numeroTavolo;
    private int maxCoperti;
    private StatoTavolo statoTavolo;

}
