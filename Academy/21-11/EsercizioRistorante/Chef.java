package EsercizioRistorante;

import java.util.ArrayList;

public class Chef extends Utente{


    private ArrayList<String> piatti;
    private static String passwordChef="pChef";
    public Chef(String email, String nome) {
        super(email, nome);
    }
    public static boolean checkPassword(String password){
        if(password.equals(passwordChef)){
            return true;
        }else{return false;}
    }
    @Override
    public void aggiungiPiatto(String piatto){
        piatti.add(piatto);
    }
}
