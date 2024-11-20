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
        if(risultatoOspite>risultatoCasa){
            squadraOspite.punteggio+=3;
        } else if (risultatoCasa==risultatoOspite) {
            squadraOspite.punteggio+=1;
            squadraCasa.punteggio+=1;
        }else{
            squadraCasa.punteggio+=3;
        }
    }
    public void stampaRisultato(){
        System.out.println("La partita tra+"+ squadraCasa.nomeSquadra+" e "+squadraOspite.nomeSquadra+" è finita: "+risultatoCasa+"-"+risultatoOspite);
    }

}
