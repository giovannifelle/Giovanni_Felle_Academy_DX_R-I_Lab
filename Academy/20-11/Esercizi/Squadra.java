package Esercizi;

public class Squadra {

    public String nomeSquadra;
    public Calciatore[] calciatori=new Calciatore[12];
    public Integer punteggio;

    public Squadra(String nomeSquadra, Calciatore[] calciatori) {
        this.nomeSquadra = nomeSquadra;
        this.calciatori = calciatori;
        this.punteggio=0;
    }

    public void stampaCalciatori(){
        System.out.println("Squadra "+nomeSquadra+":");
        for(Calciatore cal:calciatori){
            System.out.println("Calciatore: "+cal.nome+" con ruolo "+cal.ruolo);
        }
    }
}
