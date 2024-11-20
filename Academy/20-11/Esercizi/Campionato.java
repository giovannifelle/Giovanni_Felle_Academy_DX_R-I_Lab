package Esercizi;

import java.util.*;

public class Campionato {

    public Random random=new Random();

    List<Squadra> squadre = new ArrayList<>();

    public Partita[] partite=new Partita[10];

    Map<Squadra, Integer> mappaRisultati = new HashMap<>();

    public Campionato(ArrayList<Squadra> squadre) {
        this.squadre = squadre;
        int giornata=1;
        for(int i=0; i<5;i=i+2){
            Collections.shuffle(squadre);
            partite[i]=new Partita(squadre.get(0),squadre.get(1));
            partite[i+1]=new Partita(squadre.get(2),squadre.get(3));
            System.out.println("Giornata "+giornata+" risultati:");
            partite[i].stampaRisultato();
            partite[i+1].stampaRisultato();
        }
        mappaRisultati.put(squadre.get(0), squadre.get(0).punteggio);
        mappaRisultati.put(squadre.get(1), squadre.get(1).punteggio);
        mappaRisultati.put(squadre.get(2), squadre.get(2).punteggio);
        mappaRisultati.put(squadre.get(3), squadre.get(3).punteggio);
        //DA CONCLUDERE...
    }
}
