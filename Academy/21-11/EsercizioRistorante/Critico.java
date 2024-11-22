package EsercizioRistorante;

import java.util.ArrayList;

public class Critico extends Utente{


    private static String passwordCritico="pCritico";
    public Critico(String email, String nome){
        super(email, nome);
    }
    public static boolean checkPassword(String password){
        if(password.equals(passwordCritico)){
            return true;
        }else{return false;}
    }

    @Override
    public void aggiungiValutazione(String valutazione) {
        super.aggiungiValutazione(valutazione);
    }
}
