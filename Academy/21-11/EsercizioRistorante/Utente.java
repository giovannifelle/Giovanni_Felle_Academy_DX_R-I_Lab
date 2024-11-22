package EsercizioRistorante;

import java.util.ArrayList;
import java.util.Random;

public abstract class Utente extends Ristorante{

    private String nome;
    private String email;
    private Float soldi;
    private Random random=new Random();

    public Utente(String email, String nome) {
        super();
        this.soldi = random.nextFloat();
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSoldi() {
        return soldi;
    }

    public void setSoldi(Float soldi) {
        this.soldi = soldi;
    }

    @Override
    public void aggiungiPiatto(String piatto){
        super.aggiungiPiatto(piatto);
    }
    @Override
    public void aggiungiValutazione(String valutazione){
        super.aggiungiValutazione(valutazione);
    }
}
