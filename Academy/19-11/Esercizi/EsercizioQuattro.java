package Esercizi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioQuattro {
    //Array Statico di ArrayList
    private static ArrayList<Integer>[] spedizioni = new ArrayList[4]; //={new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new ArrayList<>())
    private static ArrayList<Integer> memorizzaSpedizioni=new ArrayList<>();
    //Oggetto Random
    private static Random random = new Random();
    private static Integer giornata=0;
    private static Integer minSped=100;

    //Inizializzo gli Array
    static{
        for(int i=0;i<4;i++){
            spedizioni[i]=new ArrayList<>();
        }
    }

    private static Scanner keyboardStr = new Scanner(System.in);
    private static Scanner keyboardNum = new Scanner(System.in);

    public static void main(String[] args) {

        int[] penne = new int[4];
        //MENU
        while (true) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Aggiungi spedizione\n" +
                    "2. Visualizza spedizioni\n" +
                    "3. Totale penne di un colore\n" +
                    "4. Ricerca per colore\n" +
                    "5. Simulazione temporale\n" +
                    "Premi qualsiasi tasto per uscire");
            String scelta = keyboardStr.nextLine();
            switch (scelta) {
                // Caso 1
                case "1":
                    do {
                        System.out.print("Inserisci numero penne rosse: ");
                        penne[0] = keyboardNum.nextInt();
                        System.out.print("Inserisci numero penne blu: ");
                        penne[1] = keyboardNum.nextInt();
                        System.out.print("Inserisci numero penne verde: ");
                        penne[2] = keyboardNum.nextInt();
                        System.out.print("Inserisci numero penne nero: ");
                        penne[3] = keyboardNum.nextInt();
                    } while (penne[0] < 0 && penne[1] < 0 && penne[2] < 0 && penne[3] < 0);
                    addSpedizione(penne);
                    break;
                case "2":
                    stampaSpedizioni();
                    break;
                case "3":
                    //Salvo la sceltaColore
                    String sceltaColore=sceltaUtente();
                    System.out.println("Sono state spedite in totale: "+sommaColore(sceltaColore));
                    break;
                case "4":
                    sceltaColore=sceltaUtente();
                    ricercaPerColore(sceltaColore);
                    break;
                case "5":
                    randomTask();
                    break;
                default: return;
            }
        }
    }


    //Metodo che visualizza (non stampa, ritorna semplicemente l'array) le spedizioni in base al colore scelto
    public static ArrayList<Integer> visSpedizioni(String colore) {
        colore = colore.toLowerCase();
        switch (colore) {
            case "rosso":
                return spedizioni[0];
            case "blu":
                return spedizioni[1];
            case "verde":
                return spedizioni[2];
            case "nero":
                return spedizioni[3];
            default:
                return null;
        }
    }

    //Stampa tutte le spedizioni
    public static void stampaSpedizioni() {
        if(spedizioni[0].size()==0){
            System.err.println("Nessuna spedizione registrata!");
            return;
        }
        System.out.printf("%-15s", "SPEDIZIONE");
        for (int i = 0; i < spedizioni[0].size(); i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        stampaSpedizione("Rosso");
        stampaSpedizione("Blu");
        stampaSpedizione("Verde");
        stampaSpedizione("Nero");

    }

    //Stampa la singola spedizione a linea di comando
    public static void stampaSpedizione(String colore) {
        System.out.printf("%-15s", colore.toUpperCase());
        for (Integer num : visSpedizioni(colore)) {
            System.out.printf("%5d", num);
        }
        System.out.println();
    }

    //Somma le penne di un singolo colore
    public static Integer sommaColore(String colore) {
        return sommaArray(visSpedizioni(colore));

    }

    //Somma genericamente un array
    public static Integer sommaArray(ArrayList<Integer> array) {
        Integer somma = 0;
        for (Integer num : array) {
            somma = somma + num;
        }
        return somma;
    }

    //Ricerca per colore
    public static void ricercaPerColore(String colore) {
        ArrayList<Integer> totale = visSpedizioni(colore);
        for (int i = 0; i < totale.size(); i++) {
            if (totale.get(i) != 0) {
                System.out.println("Spedizione numero " + i + ", nummero di penne di colore " + colore + ": " + totale.get(i));
            }
        }
    }

    //Aggiunge una spedizione
    public static void addSpedizione(int[] numeroPenne) {
        if (numeroPenne.length != 4) {
            System.err.println("Formato incompatibile");
            return;
        }
        for (int i = 0; i < 4; i++) {
            spedizioni[i].add(numeroPenne[i]);
        }
    }

    //Menù scelta colore reso metodo unico generico in modo da semplificare e risparmiare
    public static String sceltaUtente() {
        System.out.println("Quale colore?");
        System.out.println("1. Rosso\n" +
                "2. Blu\n" +
                "3. Verde\n" +
                "4. Nero\n");
        String scelta = keyboardStr.nextLine();
        switch (scelta) {
            case "1":
                return "rosso";
            case "2":
                return "blu";
            case "3":
                return "verde";
            case "4":
                return "nero";
            default:
                return null;
        }
    }

    //Task random scollegato dagli altri aggiunto il 20-11
    public static void randomTask(){
        int[] penne = new int[4];
        while(true){
            penne[0] = random.nextInt(70) + 1;
            penne[1] = random.nextInt(70) + 1;
            penne[2] =  random.nextInt(70) + 1;
            penne[3] = random.nextInt(70) + 1;
            addSpedizione(penne);
            giornata++;
            stampaGiornata();
            try{
            Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            verificaSpedizione();
        }
    }

    public static void verificaSpedizione(){

        Integer totaleRosse=sommaColore("rosso")-(minSped*memorizzaSpedizioni.size());

        Integer totaleBlu=sommaColore("blu")-(minSped*memorizzaSpedizioni.size());

        Integer totaleVerde=sommaColore("verde")-(minSped*memorizzaSpedizioni.size());

        Integer totaleNere=sommaColore("nero")-(minSped*memorizzaSpedizioni.size());

        if(totaleRosse>=minSped&&totaleBlu>=minSped&&totaleVerde>=minSped&&totaleNere>=minSped){
            memorizzaSpedizioni.add(1);
            System.out.println("SPEDIZIONE PARTITA NELLA GIORNATA "+giornata+" !");
        } else{
            System.out.println("LA SPEDIZIONE NON PUO' PARTIRE POICHE' MANCANO ANCORA DELLE PENNE");
        }

    }

    public static void stampaGiornata() {
        if(spedizioni[0].size()==0){
            System.err.println("Nessuna spedizione registrata!");
            return;
        }
        System.out.printf("%-15s", "GIORNATA");
        for (int i = 0; i < giornata; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        stampaSpedizione("Rosso");
        stampaSpedizione("Blu");
        stampaSpedizione("Verde");
        stampaSpedizione("Nero");

    }
}