package Esercizi;

import java.util.Scanner;

public class EsercizioUno {

    public static void main(String[] args) {
        
        Scanner keyboardStr = new Scanner(System.in);

        Scanner keyboardNum = new Scanner(System.in);

        System.out.println("Inserisci nome utente: ");
        String nomeUtente = keyboardStr.nextLine();

        System.out.println("Inserisci password: ");
        String password = keyboardStr.nextLine();

        System.out.println("Insersici l'eta'");
        int eta = keyboardNum.nextInt();
        if (eta < 18) {
            System.out.println("Bisogna essere maggiorenni per effettuare la registrazione!");
        } else if (eta > 120) {
            System.out.println("Inserire un'eta' valida!");
        } else if (nomeUtente.equals(password) || password.length() < 10) {
            System.out.println("La password non è sicura!");
        } else{
            System.out.println("Benvenuto nel sistema "+ nomeUtente);
        }

    }
}

