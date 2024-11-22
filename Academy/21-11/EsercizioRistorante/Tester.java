package EsercizioRistorante;

import java.util.Scanner;

public class Tester {

    //Non sono contento del codice, non essendo abituato a ragionare con un tipo di architettura non mia
    //ho sfruttato l'occasione più per capire come "giocare" e capire come funziona
    //avendo capito ora il ragionamento che c'è dietro, sfruttando anche questa architettura
    //lo farei in modo diverso, lo spiazzamento iniziale mi ha mangiato tempo


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, email, scelta, password;
        Ristorante ristorante = new Ristorante();
        Utente utente = null;
        while (true) {
            System.out.print("Inserisci nome: ");
            nome = scanner.nextLine();
            System.out.print("Email: ");
            email = scanner.nextLine();
            System.out.println("Che ruolo ricopri?");
            System.out.print("1. Chef\n" +
                    "2. Critico\n");
            scelta = scanner.nextLine();
            switch (scelta) {
                case "1":
                    System.out.println("Inserire password chef: ");
                    password = scanner.nextLine();
                    if (Chef.checkPassword(password)) {
                        System.out.println("Benvenuto Chef!");
                        utente = new Chef(email, nome);
                    } else {
                        System.out.println("Password errata!");

                    }
                    break;
                case "2":
                    System.out.println("Inserire password critico: ");
                    password = scanner.nextLine();
                    if (Critico.checkPassword(password)) {
                        System.out.println("Benvenuto Critico!");
                        utente = new Critico(email, nome);
                    } else {
                        System.out.println("Password errata!");
                    }
                    break;
                default:
                    System.out.println("Carattere non riconosciuto");
                    break;
            }
            if (utente instanceof Chef) {
                int numPiatti = 0;
                String piatto;
                while (true) {
                    System.out.println("---------------------");
                    System.out.println("Cosa vuoi fare:\n" +
                            "1. Guarda profilo\n" +
                            "2. Aggiungi piatti");
                    if (numPiatti >= 3) {
                        System.out.println("3. Stampa piatti\n");
                    }
                    scelta = scanner.nextLine();
                    switch (scelta) {
                        case "1":
                            System.out.println("La tua mail è " + email + " con nome: Chef" + nome);
                            break;
                        case "2":
                            System.out.print("Aggiungi piatto:");
                            piatto = scanner.nextLine();
                            utente.aggiungiPiatto(piatto);
                            ristorante.stampaPiatti();
                            numPiatti++;
                            break;

                        case "3":
                            if(numPiatti>=3){
                                ristorante.stampaPiatti();
                            }
                            break;
                        default: break;

                    }
                }
            } else if (utente instanceof Critico) {
                int numVal = 0;
                String valutazione;
                while (true) {
                    System.out.println("---------------------");
                    System.out.println("Cosa vuoi fare:\n" +
                            "1. Guarda profilo\n" +
                            "2. Aggiungi valutazione\n");
                    if (numVal >= 3) {
                        System.out.println("3. Stampa piatti\n");
                    }
                    scelta = scanner.nextLine();
                    switch (scelta) {
                        case "1":
                            System.out.println("La tua mail è " + email + " con nome: Critico" + nome);
                            break;
                        case "2":
                            System.out.print("Aggiungi valutazione:");
                            valutazione = scanner.nextLine();
                            utente.aggiungiValutazione(valutazione);
                            ristorante.stampaValutazioni();
                            break;
                    }
                }
            }
        }
    }
}