package it.epicode.Spring_JUnit.entities;

import it.epicode.Spring_JUnit.enums.StatoOrdine;
import it.epicode.Spring_JUnit.interfaces.VoceMenu;
import it.epicode.Spring_JUnit.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine implements Printable {

    private int numeroOrdine;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime oraOrdine = LocalDateTime.now();
    private List<VoceMenu> listaElementiOrdine = new ArrayList<>();
    private double costoCoperto;

    public double calcolaTotaleOrdine() {
        double totCoperti = costoCoperto * numeroCoperti;
        double totaleElementi = listaElementiOrdine.stream().mapToDouble(VoceMenu::getPrezzo).sum();
        return totCoperti + totaleElementi;
    }

    @Override
    public String print() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormattata = oraOrdine.format(formatter);
        return "Numero ordine: " + numeroOrdine + "\ntavolo: " + tavolo.getNumeroTavolo() + "\nstato ordine: " + statoOrdine + "\nnumero coperti: " + numeroCoperti + "\nora ordine: " + dataFormattata + "\ncosto coperto: " + costoCoperto + " \n --------Tot: " + calcolaTotaleOrdine() + " € --------";
    }

}
