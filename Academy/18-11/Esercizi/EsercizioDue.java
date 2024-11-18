package Esercizi;

import java.util.Scanner;
//Utilizzo del while nell'esercizio uno
public class EsercizioDue {

    public static void main(String[] args) {


        Scanner keyboardStr = new Scanner(System.in);

        Scanner keyboardNum = new Scanner(System.in);

        System.out.print("Numero utenti da inserire: ");
        int numeroUtenti = keyboardNum.nextInt();
        int contatore = 0;

        while (contatore < numeroUtenti) {

            System.out.println("Utente "+ (contatore+1));
            System.out.println("Inserisci nome utente: ");
            String nomeUtente = keyboardStr.nextLine();

            System.out.println("Inserisci password: ");
            String password = keyboardStr.nextLine();

            System.out.println("Insersici l'eta'");
            int eta = keyboardNum.nextInt();
            if (eta < 18) {
                System.err.println("Bisogna essere maggiorenni per effettuare la registrazione!");
            } else if (eta > 120) {
                System.err.println("Inserire un'eta' valida!");
            } else if (nomeUtente.equals(password) || password.length() < 10) {
                System.err.println("La password non è sicura!");
            } else {
                System.out.println("Benvenuto nel sistema " + nomeUtente);
                contatore++;
            }

        }
    }
}

