package Esercizi;

import java.util.Random;

public class Calciatore {

    public String[] possibiliNomi={"Giovanni","Marco","Luca","Andrea","Alessandro","Federico","Cosimo","Renato","Donato","Pasquale","Paolo"};
    public String[] possibiliRuoli={"Attancante","Centrocampista","Portiere","Difensore","Ala"};
    public String nome;
    public String ruolo;
    public Random random = new Random();

    public Calciatore(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    public Calciatore(){
        this.nome=possibiliNomi[random.nextInt(possibiliNomi.length)];
        this.ruolo=possibiliRuoli[random.nextInt(possibiliRuoli.length)];
    }
}
