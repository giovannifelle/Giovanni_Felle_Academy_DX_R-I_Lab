package EsercizioRistorante;

import java.util.ArrayList;

public class Ristorante {

    private static ArrayList<String> piatti;
    private static ArrayList<String> valutazioni;

    public Ristorante() {
        this.piatti = new ArrayList<>();
        this.valutazioni = new ArrayList<>();
    }

    public ArrayList<String> getPiatti() {
        return piatti;
    }

    public void setPiatti(ArrayList<String> piatti) {
        this.piatti = piatti;
    }

    public ArrayList<String> getValutazione() {
        return valutazioni;
    }

    public void setValutazione(ArrayList<String> valutazione) {
        this.valutazioni = valutazione;
    }

    public void aggiungiPiatto(String piatto){
        piatti.add(piatto);
    }
    public void aggiungiValutazione(String valutazione){
        valutazioni.add(valutazione);
    }

    public void stampaPiatti(){
        for(String p:piatti){
            System.out.println(p);
        }
    }
    public void stampaValutazioni(){
        for(String v:valutazioni){
            System.out.println(v);
        }
    }
}
