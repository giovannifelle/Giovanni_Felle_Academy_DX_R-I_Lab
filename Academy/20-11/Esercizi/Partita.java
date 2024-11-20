package Esercizi;

import java.util.Random;

public class Partita {

    public Squadra squadraCasa;
    public Squadra squadraOspite;
    public Integer risultatoCasa;
    public Integer risultatoOspite;
    public Random random = new Random();

    public Partita(Squadra squadraCasa, Squadra squadraOspite) {
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.risultatoCasa = random.nextInt(5) + 1;
        this.risultatoOspite = random.nextInt(5) + 1;
    }
    public void stampaRisultato(){
        System.out.println("La partita tra+"+ squadraCasa.nomeSquadra+" e "+squadraOspite.nomeSquadra+" è finita: "+risultatoCasa+"-"+risultatoOspite);
    }

}
